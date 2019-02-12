const data = [
  ["Janeiro", 0.76, 0.64 ],
  ["Fevereiro", 0.07, 0.08 ],
  ["Março", 0.64, 0.01 ],
  ["Abril", 0.57, -1.10 ],
  ["Maio",  1.38, -0.93 ],
  ["Junho", 1.87, -0.67 ],
  ["Julho", 0.51, -0.72 ],
  ["Agosto", 0.70,  0.10 ],
  ["Setembro", 1.52,  0.47 ],
  ["Outubro", 0.89,  0.20 ],
  ["Novembro", -0.49,  0.52 ],
  ["Dezembro", -1.08,  0.89 ]
]

function calculaDiferenca(info) {
  var calculado = []
  for (i = 0; i < info.length; i++) {
    var mes = info[i];
    var diferenca = mes[1] - mes[2]; 
    mes.push(diferenca.toFixed(2));
    calculado.push(mes);
  }
  return calculado;
}

$(document).ready(function () {

  $('#tabela').DataTable({
    data: calculaDiferenca(data),
    createdRow: function (row, data, index) {
      if (data[2] < 0) {
        $('td', row).eq(3).addClass('red');
      } else {
        $('td', row).eq(3).addClass('green');
      }
    },
  });
});