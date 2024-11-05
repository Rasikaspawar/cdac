console.log("program is started");
const myPromise = new Promise((resolve,reject)=>{
    setTimeout(()=>{
        resolve();
    },3000);
});
console.log(myPromise);
console.log("program is prgrass...");
myPromise.then(()=>{
console.log("step 1 is completed");
return new Promise((resolve,reject)=>{
    setTimeout(()=>{
        resolve("step 2 is completed");
    },3000)
})
/*then((ithe ky pan name deu shkato))*/
}).then((value)=>{
    console.log(value);
})