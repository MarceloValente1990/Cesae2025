//ex 17
// sintaxe tradicional
let myLuckyNumber = 23;
let myName = "Marcelo";
console.log("Meu nome é " + myName + "," + " e meu numero da sorte é " +  myLuckyNumber);

// sintaxe simplificada
console.log(`Meu nome é ${myName}, e meu numero da sorte é ${myLuckyNumber}`);

//ex 28
const MESSAGE = "  TASTE THE RAINBOW!   ";
console.log(MESSAGE);
let whisper = MESSAGE.toLocaleLowerCase().trim();
console.log(whisper);

//ex 30
const WORD = "skateboard";
console.log(WORD);
let facialHair = WORD.slice(5).replace("o", "e");
console.log(facialHair);

//ex 35
let firstName = prompt(`Qual teu primeiro nome?`);
let secondName = prompt(`Qual teu segundo nome?`);
console.log(`Olá ${firstName} ${secondName}`);

//ex 39
let week = prompt (`Qual o dia da semana?`);
week.toLowerCase();
    if (week = "sexta"){
    console.log(`Yay, sobrevivemos a mais uma semana`);
}
    else{
        console.log(`Força`);
    }

let passoword = parseInt(prompt (`escolha uma senha de 6 caracteres`));
if (passoword != 6){
    console.log(`senha invalida`);
}
    else{
        console.log(`ok`);
    }

switch(week){
    case `segunda`:
        console.log(`mais uma semana`)
        break;
    case `terça`:
        console.log(`mais uma semana`)
        break;
    case `quarta`:
        console.log(`mais uma semana`)
        break;
    case `quinta`:
        console.log(`mais uma semana`)
        break;
    default:
        console.log(`Yay, sobrevivemos a mais uma semana`)
        break; 
}



