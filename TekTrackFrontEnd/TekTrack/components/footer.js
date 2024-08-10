import React from 'react';
import '../styles/footer.css';
import logo from '../images/logo-black.png'; // Ensure the logo image is in the correct path

const Footer = () => {
  return (
    <footer className="footer">
      <div className="container">
        <div className="row">
          <div className="footer-col">
            <img src={logo} alt="Company Logo" style={{ maxWidth: '100%', height: 'auto' }} />
          </div>
          <div className="footer-col right-align">
            <h4>company</h4>
            <ul>
              <li>
                <a href="#">Home</a>
              </li>
              <li>
                <a href="#">Find Jobs</a>
              </li>
            </ul>
          </div>
          <div className="footer-col right-align">
            <h4>Add Jobs</h4>
            <ul>
              <li>
                <a href="#">Saved Jobs</a>
              </li>
              <li>
                <a href="#">Profile</a>
              </li>
            </ul>
          </div>
          <div className="footer-col right-align">
            <h4>Settings</h4>
          </div>
        </div>
      </div>
    </footer>
  );
};

export default Footer;