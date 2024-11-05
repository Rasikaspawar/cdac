const fatchPokemon=()=>{
    return new  Promise ((resolve,reject)=>{
        setTimeout(()=>{
          //  resolve({data : {name:"pickachu",power:20}});
          reject(new Error("danger,danger!"));
        },2000);
    });
}
console.log("program strated...");
const usePokemon =async()=>{
    try{
    const data = await fatchPokemon();
    console.log(data);
    console.log("Done fecthing..");
    }catch(error){
        console.error(error);
    }
    console.log("there was an error with our code but we're ok!");
};
 usePokemon();
 console.log("program completed!");