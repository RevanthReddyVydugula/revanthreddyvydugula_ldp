//refactor
const printName = (name) => "Hi" + name;
console.log(printName('Revanth'));


//template literals
const printBill = (name, bill) => `Hi ${name}, please pay:${bill}`;
console.log(printBill('Akhil', 45));

// destructing object
const person = {
    name: "Noam Chomsky",
    age: 92
};

let { name, age } = person;
console.log(name);
console.log(age);