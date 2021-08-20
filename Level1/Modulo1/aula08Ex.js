array1 = ["abc", 20, "Vai dar certo", 30, "Teste"];

for(i = 0; i < array1.length; i++) {
    console.log(array1[i]);
}
console.log("");



array2 = [1, 2, 3, 5, 8, 13, 21, 23, 34, 55];

soma = 0;
i = 0;
while(i < array2.length) {
    soma = soma + array2[i];
    i++;
}
media = soma / array2.length;
console.log("A média aritmética é " + media + ".");
console.log("");



nomesComuns = ["Miguel", "Laura", "Lucas", "Beatriz", "Guilherme", "Maria", "Gabriel", "Ana", "Arthur", "Júlia", 
"Enzo", "Alice", "Rafael", "Mariana", "João", "Larissa", "Gustavo", "Maria Eduarda", "Pedro", "Sofia", 
"Bernardo", "Isabela", "Matheus", "Helena", "Davi", "Camila", "Heitor", "Lara", "Henrique", "Valentina", 
"Bruno", "Letícia", "Samuel", "Luana", "Felipe", "Amanda", "Lorenzo", "Yasmin", "Benjamin", "Sophia", 
"Vinícius", "Rebeca", "Rodrigo", "Juliana", "Eduardo", "Bruna", "Diego", "Cecília", "Antônio", "Fernanda", 
"Leonardo", "Isadora", "Noah", "Lorena", "Nícolas", "Lívia", "Daniel", "Manuela", "Thiago", "Vitória"];

nome = "Maria Eduarda";

i = 0;

while(i < nomesComuns.length) {
    if(nome == nomesComuns[i]) {
        console.log((i + 1) + " " + nomesComuns[i] + ": É, nome comum :p.");
        break;
    }
    i++;
}

/*
for(i = 0; i < nomesComuns.length; i++) {
    if(nome == nomesComuns[i]) {
        console.log((i + 1) + " " + nomesComuns[i] + ": É, nome comum :p.");
        break;
    }
}
*/

if(i == nomesComuns.length) {
    console.log("Diferentão, hein? XD.");
}
console.log(i);

