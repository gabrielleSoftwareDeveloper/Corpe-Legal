//  Funciones pertenecientes a document.html
window.addEventListener("load",()=>{
    const input = document.getElementById("file");
    const filewrapper = document.getElementById("layout__uploadDocuments");

    input.addEventListener("change",(e)=>{
        let fileName = e.target.files[0].name;
        let filetype = e.target.value.split(".").pop();
        fileshow(fileName, filetype);
    })

    const fileshow = ( fileName, filetype) => {
        const showfileboxElem = document.createElement("div");
        showfileboxElem.classList.add("uploadDocuments__showfilebox");

        const leftElem = document.createElement("div");
        leftElem.classList.add("uploadDocuments__left");

        const fileTypeElem = document.createElement("span");
        fileTypeElem.classList.add("filetype");
        fileTypeElem.innerHTML = filetype;
        leftElem.append(fileTypeElem);

        const filetitleElem = document.createElement("h3");
        filetitleElem.innerHTML = fileName;
        leftElem.append(filetitleElem);
        showfileboxElem.append(leftElem);

        const rightElem = document.createElement("div");
        rightElem.classList.add("uploadDocuments__right");
        rightElem.innerHTML = '<i class="uploadDocuments__icon fa-solid fa-x"></i>';
        showfileboxElem.append(rightElem);

        filewrapper.append(showfileboxElem);

        rightElem.addEventListener("click", ()=>
        {
            filewrapper.removeChild(showfileboxElem);
        })
    }

})

