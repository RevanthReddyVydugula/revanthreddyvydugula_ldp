function getData(uId) {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            console.log("Fetched the data!");
            resolve("skc@gmail.com");
        }, 4000);
    })

}

console.log("start");
getData("skc").then((email) => {
    console.log("Email id of the user id is: " + email);
}).catch((error) => {
    console.log("Error during fetching user", error);
});

console.log("end");