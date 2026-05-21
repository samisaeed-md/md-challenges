function prepareLunch() {
    console.log("Sandwich preparation has started...");

    const crispSuccess = new Promise((resolve,reject) => {
        const success = false;
        if(success){
            resolve("Bon appetit (sandwiches plated)")
        } else {
            reject("Salad it is then.")
        }
    })

    crispSuccess
        .then((message) => {
            console.log(message);
        })
        .catch((error) => {
            console.error(error);
        })

}

prepareLunch();
