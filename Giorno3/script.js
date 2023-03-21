
// // // calcolare l'ipotenusa di un triangolo rettangolo di cateti 3 e 4. Potete usare Math
// // function ipotenusa(a,b){
// //     a = Math.pow(a, 2)
// //     b = Math.pow(b,2)

// //     return Math.sqrt(a+b)

// // }

// // console.log(ipotenusa(3,4));



// // // // scrivere una funzione che trasformi un nome nelle sue iniziali "Tizio Caio" => T.C.

// // function initials(name){

// //     let initials = ""
// //     initials += name[0].toUpperCase() + "."
// //     for(let i =1; i<name.lenght; i++){
// //         if(name[i-1] == ''){
// //             initials += name[i].toUpperCase() + "."
// //         }
// //     }

// //     return initials

// // }
// // console.log(initials('Michele De Luca'));


// // // scrivere una funzione che , dati 3 numeri, ritorni true se questi 3 numeri possono formare un triangolo. False altrimenti

// //     function canBeTrinagle(a,b,c){

// //     let primo = (a > Math.abs(b-c)) && (a < (b+c))
// //     let secondo = (b > Math.abs(a-c)) && (b <(a+c))
// //     let terzo = (c > Math.abs(a-b)) && (c <(a+b))

// //     return primo && secondo && terzo

// // }

// // console.log(canBeTrinagle(3,4,5))
// // console.log(canBeTrinagle(0,5,100))

// // // congettura di Collatz: preso un numero maggiore di 1, se questo è pari dividerlo per due, se dispari moltiplicarlo per 3 e aggiungere 1. Ripetere. Qualunque sia il numero di partenza, l'algoritmo termina sempre ad uno. Scrivere una funzione che implementi l'algoritmo e ritorni un array con il valore calcolato ad ogni 

// // function Collatz(num) {

// //     let arr = [num]

// //     while (num > 1) {

// //         if(num % 2 == 0){
// //             num = num / 2
// //         } else {
// //             num = 3 * num + 1
// //         }

// //         arr.push(num)
// //     }

// //     return arr
// // }

// // console.log(Collatz(18))



// // // - Scrivere una funzione che, assegnato un numero n,  ritorni la successione di fibonacci fino al numero n sottoforma di array.
// // //     // Ad esempio 3 => [1,1,2], 9 => [1,1,2,3,5,8,13,21,34]

// // function fibonacci(num){

// //     let a = 0;
// //     let b = 1;
// //     let c
// //     let array = [1]

// //     for(let i = 1; i <num; i++){

// //         c = a+b
// //         a = b
// //         b = c

// //         array[array.lenght]= c

        
// //     }
// //     return array
// // }

// // console.log(fibonacci(9));

// // // scrivere una funzione che, assegnato un numero n, ritorni se è primo

// // function primeNumber(num){

// //    let check;

// //    for(let i = 2; i < num; i ++){

// //     if(num % 1 == 0){
// //         console.log('Non è un numero primo')
// //         check = true
// //         break
// //     }
// //    }

// //    if(!check) console.log('E\' un numero primo')
// // }
// // primeNumber(12)

// // scrivere una funzione che assegnata una stringa ritorni la somma delle cifre in essa presenti. Ad esempio "Sono 1 stringa di 6 parole" => 

// // function isNumber(char){
// //     return (char >= '0' && char <= '9');
// // }

// // let array = "Ci sono due coccodrilli e 1 elefante, 2 piccoli serpenti e 5 galline"
// // let sum = 0

// // for (let i = 0; i < array.length; i ++){
    
// //     if(isNumber(array[i])) sum += Number(array[i])
// // }
// // console.log(sum);

// scrivere una funzione che trasformi un numero in ore e minuti. Ad esempio 3014 => 50:14. Devono essere sempre presenti due cifre, sia per le ore che per i minuti

// function OreMinuti(num){

//     return Math.floor(num/60) + ":" + num % 60
// }

// console.log(OreMinuti(3014))

// scrivere una funzione che, assegnata una stringa, ritorni l numero di vocali presenti. gestire le maiuscole

// function vocalCount(array){

//     let sum = 0

//     for (let i = 0; i < array.lenght; i ++){

//         if (/[aeiouyAEIOUY]/ .test(array[i])) sum ++
//     }

//     return sum
// }
// console.log(vocalCount("Buongiorno a tutti, sono Michele De Luca"))


// scrivere una funzione che accetta una stringa e restituisce la parola più lunga

// function mostLongWord(array){

//     let arrayWords = array.split(' ').sort ((a,b) => { return b.lenght - a.lenght})
//     return arrayWords[0]
// }

// console.log(mostLongWord('Buongiornissimo a tutti ragazzi'))

// scrivere una funzione che accetti una stringa contenente solo caratteri x e y e ritorni true se il numero delle x è uguale al numero delle y


