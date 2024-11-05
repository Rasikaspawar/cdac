console.log("program is started");
const myPromise = new Promise((resolve,reject)=>{
    setTimeout(()=>{
        resolve();
    },3000);
    setTimeout(()=>{
        reject();
    },2000);
});
console.log(myPromise);
console.log("program is process..");
myPromise.then(()=>{
    console.log("promise is completed");
}).catch(()=>{
    console.log("promise is fail");

});