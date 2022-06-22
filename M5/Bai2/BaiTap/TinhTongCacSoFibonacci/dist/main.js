"use strict";
var n1 = 0;
var n2 = 1;
var arr = [n1, n2];
var n = 10;
function fib(n) {
    let n3 = 0;
    for (let i = 2; i < n; i++) {
        n3 = n1 + n2;
        n1 = n2;
        n2 = n3;
        arr.push(n3);
    }
    return arr;
}
;
console.log(fib(n));
var sum = 0;
for (let i = 0; i < arr.length; i++) {
    sum = sum + arr[i];
}
console.log(sum);
