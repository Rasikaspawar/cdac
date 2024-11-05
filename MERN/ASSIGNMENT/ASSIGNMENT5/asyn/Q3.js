const fetchFast =()=>{
    return new Promise((resolve,reject)=>{
        setTimeout(()=>{
            resolve("Fast done")
        },2000);
    });
};
const fetchSlow =()=>{
    return new Promise((resolve,reject)=>{
        setTimeout(()=>{
            resolve("Slow done")
        },6000);
    });
};
console.log("program stating..");
const firstTimestamp = new Date();
console.log(firstTimestamp);
const useData = async()=>{
    const fastResult = await fetchFast();
    console.log(fastResult);
    const slowResult = await fetchSlow();
    console.log(slowResult);


const secondTimestamp = new Date();
const timeElapsed = secondTimestamp-firstTimestamp;
console.log("program compeleted",timeElapsed);
};
useData();
