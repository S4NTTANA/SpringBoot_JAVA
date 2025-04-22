// Criando um vetor de objetos.
const usuarios = [
    {nome: 'Marta', idade: 30},
    {nome: 'José', idade: 35},
    {nome: 'Carla', idade: 25}
    
    ]

// Filtrar idade maior que 30.
const idadeMaiorQue30 = usuarios.filter(usuario => usuario.idade > 30)
// console.log(idadeMaiorQue30)
console.log('Listando todos os usuários.')
usuarios.forEach(usuario => console.log(` Nome: ${usuario.nome}, idade: ${usuario. idade} `))

console.log('\nIdade maior que 30.')
idadeMaiorQue30.forEach(usuario => {
    console.log(`Nome: ${usuario.nome}, idade: ${usuario.idade}`)
    
})

// encontrar um  usuario especifico
const usuarioEncontrado = usuarios.find(usuario => usuario.nome === 'Marta')
console.log('\nEncontrando usuario') 
console.log(usuarioEncontrado)

// Buscar em uma lista apenas  nomes.
console.log(`\nLista com nomes dos usuarios`)
const apenasNomes = usuarios.map(usuario => usuario.nome)
apenasNomes.forEach(nome => console.log(nome))

console.log('\nLista com nomes dos usuarios - numerado')
apenasNomes.forEach((nome, index) => console.log(`${++index}: ${nome}`))


//i = 1
//console.log(i++)
//i = 1
//console.log(++i)


// Somando todas as idades.
console.log('\nsoma de todas as idades')
const somaIdades = usuarios.reduce((total, usuario) => total + usuario.idade, 0)
console.log(`Soma das idades: ${somaIdades}`)

// Transformar elementos.
const numeros = [2, 4, 6, 8]

console.log('\nOperacao de multiplicacao - dobra o valor')
const numerosDobrados = numeros.map(numero => numero * 2)
console.log(numeros)
console.log(numerosDobrados)

console.log('filtrando numeros pares')
const pares = numeros.filter((n => n % 2 === 0))
console.log(pares)

console.log('\nSomando todos os numeros')
const total = numeros.reduce((soma, atual) => soma + atual, 0)
console.log(total)

console.log('\nExibindo a media de dois numeros')
const valores = [40, 90]
const media = valores.reduce((soma, atual) => (soma + atual) / 2)
console.log(valores)
console.log(media) 


console.log('\nExibindo a media de tres notas')
const notas = [7.5, 10, 9.0]
const mediaNota = notas.reduce((soma, atual) => (soma + atual) / 2)
console.log(notas)
console.log(mediaNota) 


console.log('\nExibindo numeros pares e impares')
const nums = [1, 2, 3, 4, 5, 6]
const par = numeros.filter((n => n % 2 === 0))
const impar = numeros.filter((n => n % 2 === 1))
console.log(par)
console.log(impar)