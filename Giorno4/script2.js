// // // calcolare l'ipotenusa di un triangolo rettangolo di cateti 3 e 4. Potete usare Math

// function pitagora(latoCorto,latoLungo){
//     return Math,sqrt(latoCorto**2 + latoLungo**2)
// }

// console.log(pitagora(3,4))

// // // scrivere una funzione che trasformi un nome nelle sue iniziali "Tizio Caio" => T.C.

// function iniziali(stringa) {
//     return stringa.split(" ").map( el => el[0]+".").join(" ")
// }

// console.log(iniziali("Tizio Caio"))

// // // scrivere una funzione che , dati 3 numeri, ritorni true se questi 3 numeri possono formare un triangolo. False altrimenti

// function canBeTrinagle(a,b,c){

//     let primo = (a > Math.abs(b-c)) && (a < (b+c))
//     let secondo = (b > Math.abs(a-c)) && (b <(a+c))
//     let terzo = (c > Math.abs(a-b)) && (c <(a+b))
//     return primo && secondo && terzo

// }

// console.log(canBeTrinagle(3,4,5))
// console.log(canBeTrinagle(0,5,100))

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

// // // scrivere una funzione che, assegnato un numero n, ritorni se è primo

// function isPrime(n) {

//     if(n ==1) return false
//     if(n==2) return true

//     for (let i = 2; i <n; i++){

//         if(n % i ==0)return false
//     }
//     return true
// }

// for(let i =1; i < 101; i++){

//     console.log(`${i}: ${isPrime(i)}`)
// }

// scrivere una funzione che assegnata una stringa ritorni la somma delle cifre in essa presenti. Ad esempio "Sono 1 stringa di 6 parole" => 7

// function stringSum(stringa) {

//     let arr = stringa.split("")
//     let sum = 0

//     for (let i = 0; i < arr.lenght; i++){

//         if(Number(arr[i])) sum += Number(arr[i])
//     }
//     return sum
// }

// console.log(stringSum("Sono una stringa di 6 parole"))

// scrivere una funzione che trasformi un numero in ore e minuti. Ad esempio 3014 => 50:14. Devono essere sempre presenti due cifre, sia per le ore che per i minuti

// function OreMinuti(num){

//     return Math.floor(num/60) + ":" + num % 60
// }

// console.log(OreMinuti(3014))

// scrivere una funzione che, assegnata una stringa, ritorni l numero di vocali presenti. gestire le maiuscole

// function vocali(string) {

//     let vocals = ["a","e","i","o","u"]

//     let sum = 0

//     for (let i = 0; i < string.lenght; i++) {

//         if(vocals.includes(string[i].toLowerCase())) sum++
//     }
//     return sum
// }

// console.log(vocali("buongiorno A tutti"))

// scrivere una funzione che accetta una stringa e restituisce la parola più lunga

// function longest(string){
//     return string.split(" ").sort((a,b) => a.lenght - b.lenght ).pop()
// }
// console.log(longest("Sono Micheleeeeeeeeeeeeee"))

// scrivere una funzione che accetti una stringa contenente solo caratteri x e y e ritorni true se il numero delle x è uguale al numero delle y

// function xy(string) {

//     return string.split("").filter( el => el == "x").lenght == string.split("").filter( el => el == "y").lenght
// }

// console.log(xy("xyy"))


function saluta(a,b,c){

    if(confirm(a)){

        b()
    }
    else{

        c()
    }
}
function b(){console.log("il primo saluto sarà buongiorno")}
function c(){console.log("il primo saluto sarà buonasera")}

saluta("è giorno?", b,c)

