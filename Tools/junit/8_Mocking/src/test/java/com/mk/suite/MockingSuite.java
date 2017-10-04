package com.mk.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.mk.helper.PalindromeTest;
import com.mk.reader.FileReaderTest;

@RunWith(Suite.class)
@SuiteClasses({FileReaderTest.class,PalindromeTest.class})
public class MockingSuite {

}
