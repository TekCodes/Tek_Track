// Navbar01.js
import React from 'react';
import { Link } from 'react-router-dom';
import '../assets/styles/navbar.css'; // Ensure styles are properly loaded

function Navbar01() {
  const handleLogout = (e) => {
    e.preventDefault();
    localStorage.removeItem('id_token');
    // Handle logout logic
  };

  return (
    <nav className="navbar">
      <ul className="nav-list">
        <li className="nav-item">
          <Link to="/">Home</Link>
        </li>
        <li className="nav-item">
          <Link to="/accounts">Accounts</Link>
        </li>
        <li className="nav-item">
          <Link to="/tracker">Tracker</Link>
        </li>
        <li className="nav-item">
          <Link to="/team">Meet The Team</Link>
        </li>
      </ul>
      <div className="nav-item logout-button">
        <button onClick={handleLogout}>Logout</button>
      </div>
    </nav>
  );
}

export default Navbar01;
