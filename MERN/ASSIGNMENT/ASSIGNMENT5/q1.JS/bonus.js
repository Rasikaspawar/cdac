const mypromise = new Promise((resolve,reject)=>{
    setTimeout(()=>{
        resolve(10);
    },3000);
})
const mypromise2 = new Promise((resolve,reject)=>{
    setTimeout(()=>{
resolve(20);
    },5000)
})
Promise.all([mypromise,mypromise2]).then((values)=>{
    const firstvalue = values[0];
    const secondvalue = values[1];
console.log(values);
console.log(firstvalue,secondvalue);
console.log(firstvalue + secondvalue);
});