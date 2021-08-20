//função com o objetivo único de impressão
function imprimir(arg) { 
    console.log(arg);
}

//Função que faz a comaração para ver se dois nomes são iguais
function mesmoNomeVerificacao(nome1, nome2) {
    mesmoNome = (nome1 == nome2);
    return mesmoNome;
}

//Verificação da maioridade
function maioridade(idade) {
    maiorDeIdade = (idade >= 18);
    return maiorDeIdade;
}

//cálculo do juros de um boleto que,
//no momento, está em 10%
function calcularJuros (boleto) {
    valorComJuros = boleto * 1.10;
    return valorComJuros;
}

//cálculo da média aritmética de um array
//o FOR acessa cada elemento e os soma, um por um
//com a soma dos itens realizada, então é calculada a média dividindo-se
// a soma realizada pelo FOR pelo tamanho do array
function calcularMediaAritmetica(itens) {
    somaDosItens = 0;
    for (i = 0; i < itens.length; i++) {
        somaDosItens = somaDosItens + itens[i];
    }    
    mediaAritmetica = (somaDosItens) / itens.length;
    return mediaAritmetica;
}

//para chamar esta função é necessário informar dois parâmetros,
//receita líquida e custo de produção. Com estes dados é calculado o lucro
//bruto e a margem bruta
function margemLucro(receitaLiquida, custoProdVendidos) {
    lucroBruto = receitaLiquida - custoProdVendidos;
    margemBruta = (lucroBruto / receitaLiquida) * 100;
    return margemBruta;
}

cwi = "CWI";
reset = "Reset";
imprimir(mesmoNomeVerificacao(cwi, cwi));
imprimir(mesmoNomeVerificacao(cwi, reset));

imprimir("---");

imprimir(maioridade(30));
imprimir(maioridade(18));
imprimir(maioridade(5));

imprimir("---");

imprimir(calcularJuros(100));
imprimir(calcularJuros(984.5));

imprimir("---");

imprimir(calcularMediaAritmetica([1]));
imprimir(calcularMediaAritmetica([1, 4, 10]));
imprimir(calcularMediaAritmetica([1, 2, 3, 4, 5]));

imprimir("---");

imprimir(margemLucro(1000000, 500000));
imprimir(margemLucro(528459.11, 632501.87));
