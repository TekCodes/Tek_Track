import React, { useRef } from 'react';
import Navbar from '../components/navbar';

const WelcomePage = () => {
    const loginref = useRef(null);

    return(
        <div className="welcome-page">
            <Navbar />
        </div>
    );
}

export default WelcomePage;