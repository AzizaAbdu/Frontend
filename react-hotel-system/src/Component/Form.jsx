import React from 'react'
import "./Form.css";

function Form() {
  return (
    <div className='Form'>
    
        <div> <h1>REGISTRATION  FORM </h1>  </div>  
    
    
    
    <p><label class="p">FirstName:</label><input type="text" style={{"margin-left":"90px"}}/></p>
        <p><label class="p">MidleName:</label><input type="text" style={{"margin-left":"90px;"}}/></p>
        <p><label class="p">LastName:</label><input type="text" style={{"margin-left":" 90px;"}}/></p>
            <p> <label class="p">Gender</label> <input type="radio" tyle={{"margin-left": "90px"}} />Male<input type="radio"/>Female</p>
            <p>
                <label class="p">Phone</label><input type="text" style={{"margin-left":"90px;"}}/>
            </p>
            <p>
                <label class="p">Date  of Birth</label><input type="date" style={{"margin-left":" 90px;"}}/>
            </p>
            <p>
                <label class="p">Email</label><input type="Email" style={{"margin-left":" 90px;"}}/>
            </p>
            <p>
                <label class="p">Hotel'sName</label><input type="text" style={{"margin-left":" 90px;"}}/>
            </p>
           <p>
            <label class="p">Country</label><input type="text" style={{"margin-left":"90px;"}}/>
           </p>
           <p>
            <label class="p">Hotel's Address</label><input type="text" style={{"margin-left":"90px;"}}/>
           </p>
            <p>
                <label class="p">Document Type</label><input type="text" style={{"margin-left":"90px;"}}/>
            </p>
       <p>
        <label class="p">Document Number</label><input type="text" style={{"margin-left":"90px;"}}/>
       </p>
        <p>
            <label class="p"> Document issue</label><input type="text" style={{"margin-left": "90px;"}}/>
        </p>
<p>
            <button input type="subm">Submit</button>
            <button input type="canc"> cancel</button></p>
    
    
    
    
    
    
    </div> 
  )
}

export default Form;