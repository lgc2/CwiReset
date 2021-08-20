peso = 79.00;
altura = 1.69;

imc = peso / (altura ** 2);

classificacao = "";
grauDeObesidade = null;

if(imc < 18.50) {
    classificacao = "Magreza";
    grauDeObesidade = 0;
} else if(imc < 25.00) {
    classificacao = "Normal";
    grauDeObesidade = 0;
} else if(imc < 30.00) {
    classificacao = "Sobrepeso";
    grauDeObesidade = 1;
} else if(imc < 40.00) {
    classificacao = "Obesidade";
    grauDeObesidade = 2;
} else {
    classificacao = "Obesidade grave";
    grauDeObesidade = 3;
}

switch(classificacao) {
    case "Magreza":
        console.log("O seu IMC é " + imc + " e a classificação é " + classificacao + ".");
    break;

    case "Normal":
        console.log("O seu IMC é " + imc + " e a classificação é " + classificacao + ".");
    break;

    case "Sobrepeso":
        console.log("O seu IMC é " + imc + " e a classificação é " + classificacao + ".");
        console.log("Cuidado! Você está acima do peso recomendado pela OMS.");
    break;

    case "Obesidade":
        console.log("O seu IMC é " + imc + " e a classificação é " + classificacao + ".");
        console.log("Cuidado! Você está acima do peso recomendado pela OMS.");
    break;

    case "Obesidade grave":
        console.log("O seu IMC é " + imc + " e a classificação é " + classificacao + ".");
        console.log("Cuidado! Você está acima do peso recomendado pela OMS.");
        console.log("É importante procurar um médico para avaliar sua saúde.");
    break;
}