

console.log("promise is started");
const myPromise = new Promise((resolve,reject)=>{
    setTimeout(()=>{
    resolve("promise is completed");
    },3000);
});
console.log(myPromise);
console.log("promise is in process");
myPromise.then((value)=>{
    console.log(value);
});