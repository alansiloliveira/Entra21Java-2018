/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.java.dao;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import web.java.classe.InstituicaoBean;

/**
 *
 * @author Freakazed-PC
 */
public class InstituicaoDAOTest {
    
    public InstituicaoDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of insereInstituicao method, of class InstituicaoDAO.
     */
    @Test
    public void testInsereInstituicao() {
        System.out.println("insereInstituicao");
        InstituicaoBean instituicao = null;
        boolean expResult = false;
        boolean result = InstituicaoDAO.insereInstituicao(instituicao);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listaInstituicao method, of class InstituicaoDAO.
     */
    @Test
    public void testListaInstituicao() {
        System.out.println("listaInstituicao");
        InstituicaoDAO instance = new InstituicaoDAO();
        List<InstituicaoBean> expResult = null;
        List<InstituicaoBean> result = instance.listaInstituicao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listaInstituicaoPorId method, of class InstituicaoDAO.
     */
    @Test
    public void testListaInstituicaoPorId() {
        System.out.println("listaInstituicaoPorId");
        int id = 0;
        InstituicaoDAO instance = new InstituicaoDAO();
        List<InstituicaoBean> expResult = null;
        List<InstituicaoBean> result = instance.listaInstituicaoPorId(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of alteraInstituicao method, of class InstituicaoDAO.
     */
    @Test
    public void testAlteraInstituicao() {
        System.out.println("alteraInstituicao");
        InstituicaoBean instituicao = null;
        InstituicaoDAO instance = new InstituicaoDAO();
        boolean expResult = false;
        boolean result = instance.alteraInstituicao(instituicao);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
