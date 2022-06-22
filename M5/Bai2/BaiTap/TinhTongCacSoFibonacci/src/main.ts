var n1: number = 0;
var n2: number = 1;
var arr: Array<number> = [n1, n2];
var n: number = 10;
function fib (n:number):Array<number>{
    let n3: number = 0;
    for (let i: number = 2;i<n;i++){
        n3=n1+n2;
        n1=n2;
        n2=n3;
        arr.push(n3);
    }
    return arr;
};
console.log(fib(n));
var sum: number = 0;
for (let i:number = 0;i<arr.length;i++){
    sum = sum+arr[i];
}
console.log(sum);