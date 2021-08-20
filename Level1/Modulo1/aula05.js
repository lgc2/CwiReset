nomeDoFulano = "Luiz Gustavo Coutinho Carvalho";
nomeDoBeltrano = "Pedro Augusto";

mesmoNome = (nomeDoFulano == nomeDoBeltrano);
console.log(mesmoNome);

/*
idade = 18;
maiorDeIdade = false;
if (idade >= 18) {
    maiorDeIdade = true;
}
console.log("Maioridade é " + maiorDeIdade);
*/
idade = 17;
maiorDeIdade = (idade >= 18);
console.log("Adulto: " + maiorDeIdade);

boleto = 100;
valorComJuros = boleto * 1.1;
console.log(valorComJuros);

item1 = 45;
item2 = 5;
item3 = 4;
item4 = 89;
item5 = 7;
mediaAritmetica = (item1 + item2 + item3 + item4 + item5) / 5;
console.log("A média aritmética é " + mediaAritmetica);

receitaLiquidaVendas = 100000;
custoProdutos = 89000;
lucroBruto = receitaLiquidaVendas - custoProdutos;
margemBruta = (lucroBruto / receitaLiquidaVendas) * 100;
console.log("A margem bruta é " + margemBruta + "%");

/*
function saldoCalculo (saldo, entrada, saida) {
    saldo = saldo + entrada - saida;
    return saldo;
}

saldo = 1000;
entrada = 0;
saida = 0;
saldoCalculo(saldo, entrada, saida);
saida += 99.90;
entrada += 2500.00;
saida += 0.10;
saldoCalculo(saldo, entrada, saida)
saida += 0.25 * saldoCalculo(saldo, entrada, saida);
saldoCalculo(saldo, entrada, saida);
saida += 0.50 * saldoCalculo(saldo, entrada, saida);
saldoCalculo(saldo, entrada, saida);
console.log("O saldo atual é de " + saldoCalculo(saldo, entrada, saida));
*/
/*
saldo = 1000;
entrada = 0;
saida = 0;
saldo = saldo + entrada - saida;
saida += 99.90;
entrada += 2500.00;
saida += 0.10;
saldo = saldo + entrada - saida;
saida = 0.25 * saldo;
console.log(saida)
saldo = saldo - saida;
console.log(saldo)
saida = 0.50 * saldo;
saldo = saldo - saida;
console.log("O saldo atual é " + saldo + ".");
*/
saldo = 1000;
entrada = 0;
saida = 0;
saldo = saldo + entrada - saida;
saida = 99.90;
entrada = 2500.00;
saida += 0.10;
saldo = saldo + entrada - saida;
saida = 0.25 * saldo;
entrada = 0;
saldo = saldo + entrada - saida;
saida = 0.50 * saldo;
entrada = 0;
saldo = saldo + entrada - saida;
console.log("O saldo atual é de " + saldo + ".");