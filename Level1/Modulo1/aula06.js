nota1 = 4.0;
nota2 = 10;

media = (nota1 + nota2) / 2;

conceito = "";

if(media <= 4.0) {
    conceito = "Ruim";
} else if(media <= 6.0) {
    conceito = "Regular";
} else if(media <= 8.0) {
    conceito = "Bom";
} else {
    conceito = "Ótimo";
}

console.log("Sua média foi " + media + ".");
console.log("Seu conceito foi " + conceito + ".");

switch(conceito) {
    case "Ruim":
        console.log("Precisa estudar mais.");
    break;

    case "Regular":
        console.log("Está quase lá.");
    break;

    case "Bom":
        console.log("Continue assim.");
    break;

    case "Ótimo":
        console.log("Mandou bem!!!");
    break;
}
