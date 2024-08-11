import React from 'react';
import '../assets/styles/logoBanner.css'; // Ensure styles are properly loaded

function LogoBanner() {
  return (
    <div className="logo-banner">
      <img src="../assets/images/logo-white.png" alt="Logo" className="logo-image" />
    </div>
  );
}

export default LogoBanner;
