package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here

    @Test
    public void testSettingJobId() {
        String msg = "Each Job object should have a unique ID that is an integer";
        Job job1 = new Job();
        Job job2 = new Job();

        assertNotEquals(msg, job1.getId(), job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
//        String msg = "Each Job object should contain six fields—id, name, employer, location, positionType, and coreCompetency";

        Job job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

//        boolean isClassObject = job3 instanceof Job;
//        assertTrue("The object should be an instance of a Job class", isClassObject);

        boolean isString = job3.getName() instanceof String;
        assertTrue("The object should be an instance of a string class", isString);

        boolean isEmployer = job3.getEmployer() instanceof Employer;
        assertTrue("The object should be an instance of an employer class", isEmployer);

        boolean isLocation = job3.getLocation() instanceof Location;
        assertTrue("The object should be an instance of a location class", isLocation);

        boolean isPositionType = job3.getPositionType() instanceof PositionType;
        assertTrue("The object should be an instance of a position type class", isPositionType);

        boolean isCoreCompetency = job3.getCoreCompetency() instanceof CoreCompetency;
        assertTrue("The object should be an instance of a employer class", isCoreCompetency);


        String expectedName = "Product tester";
        String actualName = job3.getName();
        assertEquals("Constructor sets name", expectedName, actualName);

        String expectedEmployer = "ACME";
        String actualEmployer = job3.getEmployer().getValue();
        assertEquals("Constructor sets employer", expectedEmployer, actualEmployer);

        String expectedLocation = "Desert";
        String actualLocation = job3.getLocation().getValue();
        assertEquals("Constructor sets location", expectedLocation, actualLocation);

        String expectedPositionType = "Quality control";
        String actualPositionType = job3.getPositionType().getValue();
        assertEquals("Constructor sets position type", expectedPositionType, actualPositionType);

        String expectedCoreCompetency = "Persistence";
        String actualCoreCompetency = job3.getCoreCompetency().getValue();
        assertEquals("Constructor sets core competency", expectedCoreCompetency, actualCoreCompetency);
    }

    @Test
    public void testJobsForEquality() {
        Job job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        boolean isIdEqual = job4.equals(job5);
        assertFalse("Two Job objects IDs are not equal", isIdEqual);
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        String newline = System.lineSeparator();

        Job job5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String msgBlankLine = "Job object contains a blank line before and after the job information";

        String firstChar = String.valueOf(job5.toString().charAt(0));
        String lastChar = String.valueOf(job5.toString().charAt(job5.toString().length() - 1));

        assertEquals(msgBlankLine, firstChar, newline);
        assertEquals(msgBlankLine, lastChar, newline);

    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        String newline = System.lineSeparator();

        Job job6 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String msgString = "The string should contain a label for each field, followed by the data stored in that field. Each field should be on its own line.";
        String expectedString = newline +
                "ID: " + job6.getId() + newline +
                "Name: Product tester" + newline +
                "Employer: ACME" + newline +
                "Location: Desert" + newline +
                "Position Type: Quality control" + newline +
                "Core Competency: Persistence" + newline;
        String actualString = job6.toString();
        assertEquals(msgString, expectedString, actualString);

    }

    @Test
    public void testToStringHandlesEmptyField() {
        String newline = System.lineSeparator();

        Job job7 = new Job("Product tester", new Employer("ACME"), new Location(""), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String msgNoData = "If a job object's field is empty, display 'Data not available'";
        String expectedNoData = newline +
                "ID: " + job7.getId() + newline +
                "Name: Product tester" + newline +
                "Employer: ACME" + newline +
                "Location: Data not available" + newline +
                "Position Type: Quality control" + newline +
                "Core Competency: Persistence" + newline;
        String actualNoData = job7.toString();
        assertEquals(msgNoData, expectedNoData, actualNoData);
    }

//    @Test
//    public void testToStringHandlesNoData() {
//
//        Job job8 = new Job();
//        String msgIdOnly = "If a Job object ONLY contains data for the id field, the method should return, 'OOPS! This job does not seem to exist.'";
//        String expectedIdOnly = "OOPS! This job does not seem to exist.";
//
//        String actualIdOnly = job8.toString();
//        assertEquals(msgIdOnly, expectedIdOnly, actualIdOnly);
//    }


}
