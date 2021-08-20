alunos = ["Enzo", "Valentina", "Joana", "Márcio"];

notas = [[5.6, 7.2], [9.1, 8.4], [5.8, 4.6], [4.5, 8.5]];

alunoSelecionado = 3;

nomeDoAluno = alunos[alunoSelecionado];
notaDoAluno = notas[alunoSelecionado];

nota1 = notaDoAluno[0];
nota2 = notaDoAluno[1];

media = (nota1 + nota2) / 2;

console.log(nomeDoAluno);
console.log("A primeira nota foi:", nota1);
console.log("A segunda nota foi:", nota2);
console.log("O(a) aluno(a)", nomeDoAluno, "teve média", media);
console.log(alunos.length);
console.log(notas.length);

console.log(Array.isArray(notaDoAluno));