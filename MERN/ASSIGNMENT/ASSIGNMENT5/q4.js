console.log("prgram is started");
const mypromise = new Promise((resolve,reject)=>{
    setTimeout(()=>{
        resolve( {data: "hellow friend",error:null});
        
    },5000);

});
console.log(mypromise)
console.log("program is prograss")
mypromise.then((val)=>{
    console.log(val);
    return new Promise((resolve,reject)=>{
        setTimeout(()=>{
            resolve("first promis chain is completed");
        },2000)
    });
}).then((val)=>{
    console.log(val);
});
mypromise.then((val)=>{
    console.log(val);
    return new Promise((resolve,reject)=>{
        setTimeout(()=>{
            resolve("second promise chain is completed");
        },10000)
    }).then((val)=>{
        console.log(val);
    });
})