
// import { BrowserRouter, Route, Routes } from 'react-router-dom';
import './App.css';
import About from './Component/About';
import Contact from './Component/contact';
import {BrowserRouter as Router, Routes, Route} from 'react-router-dom';
import Nav from './Pages/Nav';
import Registration from './Component/Registration';
import Home from './Component/Home';
import Dash from './Component/Dash';
import Form from './Component/Form';
import Conform from './Component/Conform';
// import Cus from './Pages/Cus';

function App() {
  return (
    <div>
    <Router>
    <Nav />
        <Routes>
            <Route path="Dash" element={<Dash/>}/>
           <Route path="home" element={<Home/>}/>
           <Route path="aboute" element={<About />} />
           <Route path="contact" element={<Contact />}/> 
           <Route path='registration' element={<Registration/>}/>  
           <Route path='Form' element={<Form/>}/>  
           <Route path='Conform' element={<Conform/>}/>     
        </Routes>        
    </Router>
    
    </div>








  // <div className='App'>
    //  <Cus/>


    //</div>
    // <BrowserRouter>
    // <Routes>
    //   <Route   path='/' element={<Cus/>}/>
    // </Routes>

    // </BrowserRouter>
  );
}

export default App;
   
