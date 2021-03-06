-- MySQL Script generated by MySQL Workbench
-- Mon Oct  1 03:37:19 2018
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema schoolshare
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `schoolshare` ;

-- -----------------------------------------------------
-- Schema schoolshare
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `schoolshare` DEFAULT CHARACTER SET utf8 ;
USE `schoolshare` ;

-- -----------------------------------------------------
-- Table `schoolshare`.`pessoas`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `schoolshare`.`pessoas` ;

CREATE TABLE IF NOT EXISTS `schoolshare`.`pessoas` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome_completo` VARCHAR(100) NOT NULL,
  `genero` TINYINT(1) NOT NULL,
  `data_nascimento` DATE NOT NULL,
  `email` VARCHAR(50) NOT NULL,
  `telefone` VARCHAR(15) NOT NULL,
  `login` VARCHAR(30) NOT NULL,
  `senha` VARCHAR(255) NOT NULL,
  `ativo` TINYINT(1) NOT NULL DEFAULT 1,
  `acesso` TINYINT(1) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `email_UNIQUE` (`email` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `schoolshare`.`alunos`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `schoolshare`.`alunos` ;

CREATE TABLE IF NOT EXISTS `schoolshare`.`alunos` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `pessoas_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_alunos_pessoas1_idx` (`pessoas_id` ASC),
  CONSTRAINT `fk_alunos_pessoas1`
    FOREIGN KEY (`pessoas_id`)
    REFERENCES `schoolshare`.`pessoas` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `schoolshare`.`professores`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `schoolshare`.`professores` ;

CREATE TABLE IF NOT EXISTS `schoolshare`.`professores` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `pessoas_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_professores_pessoas_idx` (`pessoas_id` ASC),
  CONSTRAINT `fk_professores_pessoas`
    FOREIGN KEY (`pessoas_id`)
    REFERENCES `schoolshare`.`pessoas` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `schoolshare`.`instituicao`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `schoolshare`.`instituicao` ;

CREATE TABLE IF NOT EXISTS `schoolshare`.`instituicao` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `instituicao` VARCHAR(100) NOT NULL,
  `endereco` VARCHAR(45) NOT NULL,
  `numero` VARCHAR(10) NOT NULL,
  `cep` VARCHAR(9) NOT NULL,
  `bairro` VARCHAR(30) NOT NULL,
  `cidade` VARCHAR(50) NOT NULL,
  `estado` VARCHAR(2) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `instituicao_UNIQUE` (`instituicao` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `schoolshare`.`cursos`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `schoolshare`.`cursos` ;

CREATE TABLE IF NOT EXISTS `schoolshare`.`cursos` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `instituicao_id` INT NOT NULL,
  `curso` VARCHAR(150) NOT NULL,
  `data_inicio` DATE NOT NULL,
  `data_final` DATE NOT NULL,
  `carga_horaria` SMALLINT(3) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `curso_UNIQUE` (`curso` ASC),
  INDEX `fk_cursos_instituicao1_idx` (`instituicao_id` ASC),
  CONSTRAINT `fk_cursos_instituicao1`
    FOREIGN KEY (`instituicao_id`)
    REFERENCES `schoolshare`.`instituicao` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `schoolshare`.`turmas`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `schoolshare`.`turmas` ;

CREATE TABLE IF NOT EXISTS `schoolshare`.`turmas` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `cursos_id` INT NOT NULL,
  `professores_id` INT NOT NULL,
  `turma` VARCHAR(45) NOT NULL,
  `data_inicio` DATE NOT NULL,
  `data_final` DATE NOT NULL,
  `carga_horaria` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_turmas_cursos1_idx` (`cursos_id` ASC),
  INDEX `fk_turmas_professores1_idx` (`professores_id` ASC),
  CONSTRAINT `fk_turmas_cursos1`
    FOREIGN KEY (`cursos_id`)
    REFERENCES `schoolshare`.`cursos` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_turmas_professores1`
    FOREIGN KEY (`professores_id`)
    REFERENCES `schoolshare`.`professores` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `schoolshare`.`matriculas`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `schoolshare`.`matriculas` ;

CREATE TABLE IF NOT EXISTS `schoolshare`.`matriculas` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `alunos_id` INT NOT NULL,
  `turmas_id` INT NOT NULL,
  `matricula` VARCHAR(20) NOT NULL,
  `data_matricula` DATE NOT NULL,
  `data_inativo` DATE NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_matriculas_alunos1_idx` (`alunos_id` ASC),
  INDEX `fk_matriculas_turmas1_idx` (`turmas_id` ASC),
  CONSTRAINT `fk_matriculas_alunos1`
    FOREIGN KEY (`alunos_id`)
    REFERENCES `schoolshare`.`alunos` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_matriculas_turmas1`
    FOREIGN KEY (`turmas_id`)
    REFERENCES `schoolshare`.`turmas` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `schoolshare`.`notas`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `schoolshare`.`notas` ;

CREATE TABLE IF NOT EXISTS `schoolshare`.`notas` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `matriculas_id` INT NOT NULL,
  `nota_1` FLOAT NULL,
  `nota_2` FLOAT NULL,
  `nota_3` FLOAT NULL,
  `nota_4` FLOAT NULL,
  `nota_5` FLOAT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_notas_matriculas1_idx` (`matriculas_id` ASC),
  CONSTRAINT `fk_notas_matriculas1`
    FOREIGN KEY (`matriculas_id`)
    REFERENCES `schoolshare`.`matriculas` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `schoolshare`.`avaliacao`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `schoolshare`.`avaliacao` ;

CREATE TABLE IF NOT EXISTS `schoolshare`.`avaliacao` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `pessoas_id` INT NOT NULL,
  `p_desempenho` TINYINT(1) NOT NULL,
  `p_carregamento` TINYINT(1) NOT NULL,
  `p_visual` TINYINT(1) NOT NULL,
  `p_design` TINYINT(1) NOT NULL,
  `p_problema` TINYINT(1) NOT NULL,
  `p_uso` TINYINT(1) NOT NULL,
  `p_conteudo` TINYINT(1) NOT NULL,
  `p_organizacao` TINYINT(1) NOT NULL,
  `descricao` LONGTEXT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_avalacao_pessoas1_idx` (`pessoas_id` ASC),
  CONSTRAINT `fk_avalacao_pessoas1`
    FOREIGN KEY (`pessoas_id`)
    REFERENCES `schoolshare`.`pessoas` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `schoolshare`.`mensagem`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `schoolshare`.`mensagem` ;

CREATE TABLE IF NOT EXISTS `schoolshare`.`mensagem` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `pessoas_id` INT NOT NULL,
  `mensagem` VARCHAR(255) NOT NULL,
  `descricao` VARCHAR(50) NOT NULL,
  `data_envio` DATETIME NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_mensagem_pessoas1_idx` (`pessoas_id` ASC),
  CONSTRAINT `fk_mensagem_pessoas1`
    FOREIGN KEY (`pessoas_id`)
    REFERENCES `schoolshare`.`pessoas` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
