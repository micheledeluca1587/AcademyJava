import fizzbuzz from "../src/fizzbuzz";

describe("fizbuzz", () =>{

    it("should return 1 for 1",() =>{
        const n= 1;
        const result = fizzbuzz(n);

        expect(result).toBe(n)
    })

    it("should return Fizz for number %3", ()=>{
        expect(fizzbuzz(3)).toBe("Fizz")

    })

    it("should return Buzz for number %5", ()=>{
        expect(fizzbuzz(5)).toBe("Buzz")
    })
    it("should return FizzBuzz for number %3 and %5", ()=>{
        expect(fizzbuzz(15)).toBe("FizzBuzz")
})})
