function verificarAposentadoria(nome) {
    nomeNaLista = false;
    for(i = 0; i < colaboradores.length; i++) {
        if(nome == colaboradores[i]) {
            nomeNaLista = true;
            idade = idades[i];
            tempoDeTrabalho = temposDeTrabalho[i];

            if(idade >= 65) {
                console.log("Parebéns, já pode sair de férias eternas :)");
            } else if(tempoDeTrabalho >= 30) {
                console.log("Parebéns, já pode sair de férias eternas :)");
            } else if(idade >= 60 && tempoDeTrabalho >= 25) {
                console.log("Parebéns, já pode sair de férias eternas :)");
            } else {
                console.log("Infelizmente para você, ainda falta um tempo :(");
            }
            break;
        }       
    }

    if(nomeNaLista != true) {
        console.log("Colaborador inválido :|");
    } 
}

colaboradores    = ['Rhoger', 'Cléverson', 'Gleysberto', 'Nádio', 'Rosiméri', 'Regislane', 'Agripino', 'Wellison'];
idades           = [      69,          66,           58,      61,         60,          64,         59,         55];
temposDeTrabalho = [      31,          29,           30,      26,         25,          24,         26,         29];

verificarAposentadoria('Rhoger');