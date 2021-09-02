/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package mergeSort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    //Happy Path
    @Test void testMergeSort() throws Exception {
        int arr[] = {5,-12,3,8,16,20,19};

        MergeSort mergeSort = new MergeSort();
        assertEquals(8, mergeSort.mergeSort(arr)[3]);
    }

    //Expected Failure || Edge case
    @Test void testTheTheMethodDivideAndConquer() throws Exception {
        int arr[] = new int[0];

        MergeSort mergeSort = new MergeSort();
        Assertions.assertThrows(Exception.class, ()->{
            mergeSort.mergeSort(arr);
        });

    }
}