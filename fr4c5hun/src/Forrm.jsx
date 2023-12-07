
function Forrm(){

    const stl = {
      
        border:"none",
        borderRadius:"10px",
         margin:"25px",
         padding:"10px",
        marginLeft:"auto",
        marginRight:"auto",
        paddingLeft:"0.5rem",
        paddingRight:"0.5rem", 
        fontFamily:"lucida console",
    };

    const inp = {
        backgroundColor:"white",
        borderRadius:"8px",
          margin:"5px 5px 2px 5px",
          padding:"11px",
        
        border:"1px",
        fontFamily:"lucida console",
       
    };

    const lab = {
        margin:"5px 5px 2px 5px",
        padding:"2px",
        fontFamily:"lucida console",
        
    };

    const frm={
        maxWidth:"550px",
        fontFamily:"Monaco",
        backgroundColor:"orange",
     
      marginLeft:"auto",
       marginRight:"auto",
   
       border:"2px solid",
        borderRadius:"8px",
        textAlign:"center",
        width:"90%",
        
    };
    const h = {
        textAlign:"center",
       
    };
    return(

        <div>
            <form style={frm }  method="post" action="http://localhost:8080/get/barath.html@gmail.com"> 
            <h1>CONTACT_US</h1>

          { /* <label style={lab}>Name</label>
       <input style={inp} type="text" /><br></br>

    */}
	           <label style={lab}> MailID </label>
       <input style={inp} type="text" /><br></br>


<label style={lab}>Message</label>
       <input style={inp} type="text" name="txt" /><br></br>

       


       <button type="submit" style={stl}> SEND </button>
            </form>
        </div>
    )

}

export default Forrm;
