async function clickLogin() {

    let loginform = document.getElementById("loginForm");
    const formData = new FormData(loginform);
    const object = Object.fromEntries(formData);
    console.log(object);

  /*  const res = await fetch("api/login", {
        method: "POST",
        body: JSON.stringify(object),
        headers: {
            "content-type": "application/json"
        }
    })*/

    window.location.href="desktop.html"
    console.log(res.text());
}