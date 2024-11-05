console.log("Promise started");
/*below write i am promise constructor*/
const myPromise= new Promise((resolve,reject)=>{
    setTimeout(()=>{
        resolve();
       
    },3000)

});
console.log(myPromise);
console.log("program in process....");

myPromise .then(()=>{
  console.log("program completed");
})