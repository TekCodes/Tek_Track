// WelcomePage.js
import React from 'react';
import { View, Text, StyleSheet } from 'react-native';
import Navbar01 from '../components/Navbar01'; // Ensure Navbar01 is web-compatible or use conditional rendering

const WelcomePage = () => {
  return (
    <View style={styles.container}>
      <Text>Welcome to the Welcome Page!</Text>
      <Navbar01 /> {/* Ensure Navbar01 is properly adapted or rendered conditionally */}
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
