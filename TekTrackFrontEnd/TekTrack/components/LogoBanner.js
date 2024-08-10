// LogoBanner.js
import React from 'react';
import '../assets/styles/logoBanner.css'; // Ensure styles are properly loaded
import logo from '../assets/images/logo-white.png'; // Import the image

function LogoBanner() {
  const handleLogout = (e) => {
    e.preventDefault();
    localStorage.removeItem('id_token');
    // Add any additional logout logic here, e.g., redirect to login page
  };

  return (
    <div className="logo-banner">
      <img src={logo} alt="Logo" className="logo-image" />
      {/* Example logout button if needed */}
      <button onClick={handleLogout} className="logout-button">
        Logout
      </button>
    </div>
  );
}

export default LogoBanner;
