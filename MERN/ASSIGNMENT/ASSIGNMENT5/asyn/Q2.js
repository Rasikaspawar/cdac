const fetchUser=()=>{
    return new Promise((resolve,reject)=>{
        setTimeout(()=>{
         resolve({data : {user:"Monkey",admin: true}});
        },2000);
    });
};
const login = (user)=>{
    if(user.admin= true){
        console.log("successfully logged in!");
    }else{
        console.log("Failed to log in, plese try again");
    }
};
const userAdmin = async() => {
const result = await fetchUser();
console.log(result);
login(result.data);
};
userAdmin();
console.log("program complete!");