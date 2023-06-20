import React from 'react'
import { Link } from 'react-router-dom';
import About from '../Component/About';
import Contact from '../Component/contact';

function Nav() {
  return (
        <div>
          
            <Link to="/">Home</Link>  
            <Link to="aboute"> Aboute </Link>
            <Link to="contact">Contact</Link> 
                        
        </div>
        
     )
}

export default Nav;