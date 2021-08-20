/*
let num = 1;

while(num < 11) {
    console.log("While:", num);
    num++;
}

for(i=0; i < 10; i++) {
    console.log("FOR:", i + 1);
}

let num1 = 1;

do {
    console.log("DO WHILE:", num1);
    num1++;
} while(num1 <= 10);
*/

alunos = ["Enzo", "Valentina", "Joana", "Márcio", "José", "Paulo"];

notas = [[5.6, 7.2], [9.1, 8.4], [5.8, 4.6], [4.5, 8.5], [8.8, 7.2], [5.6, 8.99]];

for(i = 0; i < alunos.length; i++) {
    nota1 = notas[i][0];
    nota2 = notas[i][1];

    media = (nota1 + nota2) / 2;
    
    console.log("Nome:", alunos[i]);
    console.log("A primeira nota foi:", nota1);
    console.log("A segunda foi:", nota2);
    console.log("A média do aluno foi " + media);
    console.log("=================================");
}


strNum = "2458";

soma = 0;

for(i = 0; i < strNum.length; i++) {
    numFormat = parseFloat(strNum[i]);
    soma = soma + numFormat;
}

console.log(soma);
console.log(typeof soma);