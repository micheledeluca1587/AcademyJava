// describe("basics", () => {

//     beforeEach(() =>{       
//     // viene eseguita prima do ogni test effettivo

     
//     })

//     it("works", () => {
//         // corpo del test
//         // comando di cosa si aspetta e cosa si ottiene
//         expect(2).toBe(2);

//     })
// })
import sum from './../src/sum.js';



describe("sum", () =>{
    it("deve ritonare 16 se viene invocata con i parametri 8 e 8", () =>{

        expect(sum(8,8)).toBe(16); 
    })
})

