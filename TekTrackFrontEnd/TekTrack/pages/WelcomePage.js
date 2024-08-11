// WelcomePage.js
import React from 'react';
import { View, Text, StyleSheet } from 'react-native';
import Navbar01 from '../components/Navbar01'; 
import Footer01 from '../components/Footer01'; 
import LogoBanner from '../components/LogoBanner';

const WelcomePage = () => {
  return (
    <View style={styles.container}>
      <LogoBanner />
      <Navbar01 /> 
      <Text>Welcome to TechTrack!<br></br>
        Your Ultimate Companion for Managing Tech Opportunities.</Text>
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
