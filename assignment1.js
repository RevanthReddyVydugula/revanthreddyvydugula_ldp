//Write a program to demonstrate how a function can be passed as a parameter to another function.
let num1 = 10;
let num2 = 20;

function newOperation(num1, num2, operation) {
    return operation(num1, num2);
}

function add(x, y) {
    return x + y;
}

function subtract(x, y) {
    return x - y;
}

function multiply(x, y) {
    return x * y;
}

function divide(x, y) {
    if (y === 0) {
        return "Error: Division by zero!";
    }
    return x / y;
}

console.log("addition result " + newOperation(num1, num2, add));
console.log("Subtraction: " + newOperation(num2, num1, subtract));
console.log("Multiplication result is " + newOperation(15, 15, multiply));
console.log("Division : " + newOperation(num2, num1, divide));
num2 = 0;
console.log("Division :" + newOperation(num1, num2, divide));