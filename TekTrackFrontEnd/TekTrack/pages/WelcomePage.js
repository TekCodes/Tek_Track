// WelcomePage.js
import React from 'react';
import { View, Text, StyleSheet } from 'react-native';
import Navbar01 from '../components/Navbar01'; // Ensure Navbar01 is web-compatible or use conditional rendering
import Footer01 from '../components/Footer01'; // Importing of Footer01
import LogoBanner from '../components/LogoBanner';

const WelcomePage = () => {
  return (
    <View style={styles.container}>
      <LogoBanner />
      <Navbar01 /> 
      <Text>APP CONTENT GOES HERE!</Text>
      {/* Ensure Navbar01 is properly adapted or rendered conditionally */}
      <Footer01 />
    </View>
  );
};

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
  },
});

export default WelcomePage;
