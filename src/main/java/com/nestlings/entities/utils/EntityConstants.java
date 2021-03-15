package com.nestlings.entities.utils;

/**
 * @author ú
 */
public class EntityConstants {

    private EntityConstants() {
    }

    public static final String USER_CODE_PREFIX = "U";
    public static final String LOGGED_IN_USER = "loggedInUser";


    public static final String UNIVERSITY_SERVICE_URL = "http://localhost:8082/";

    /*
     * EXCHANGE
     */
    public static final String MESSAGING_EXCHANGE = "nestlings_webapp";

    /*
     * QUEUE
     */
    public static final String MESSAGING_MESSAGING_QUEUE = "messaging_queue";
    public static final String MESSAGING_COMMON_QUEUE = "common_queue";
    public static final String MESSAGING_NOTIFICATION_QUEUE = "notification_queue";

    /*
     * ROUTING_KEY
     */
    public static final String MESSAGING_MESSAGING_ROUTING = "messaging";
    public static final String MESSAGING_COMMON_ROUTING = "common";
    public static final String MESSAGING_NOTIFICATION_ROUTING = "notification";

    /*
     * WebSecurityConfig
     */

    public static final String STUDENT = "STUDENT";
    public static final String COLLEGE = "COLLEGE";

    /*
     * EMAIL
     */

    public static final String FULLNAME = "fullName";
    public static final String NOTIFICATION_MESSAGE = "notificationMessage";
    public static final String NOTIFICATION_URL = "notificationsUrl";
    public static final String EMAIL_URL = "emailUnsubscribeUrl";

    /*
     * USER
     */

    public static final String USER_ID = "userId";
    public static final String EMAIL_ID = "emailID";
    public static final String FRIENDID = "friendId";
    public static final String FACEBOOKID = "facebookId";
    public static final String GOOGLEID = "googleID";
    public static final String APPLEID = "appleID";

    /*
     * DEVICE_TOKEN
     */
    public static final String USERDEVICEID = "userDeviceID";
    public static final String TOKEN = "token";
    public static final String VERSION = "version";
    public static final String DEVICENAME = "deviceName";
    public static final String DEVICETYPE = "deviceType";
    public static final String USERID = "userID";


    /*
     * SCORE
     */
    public static final String SCOREID = "scoreID";
    public static final String SCORE_DATE = "scoreDate";
    public static final String VERBAL = "verbal";
    public static final String QUANTITATIVE = "quantitative";
    public static final String WRITING = "writing";
    public static final String TOTAL = "total";
    public static final String LISTENING = "listening";
    public static final String SPEAKINGS = "speaking";
    public static final String READINGS = "reading";
    public static final String CERTIFICATEURL = "certificateUrl";

    /*
     * TEST_SCORE
     */
    public static final String TEST_SCOREID = "testScoreID";
    public static final String TEST_DATE = "testDate";
    public static final String ENGLISH_SCORE = "englishScore";
    public static final String MATH_SCORE = "mathScore";
    public static final String SCIENCE_SCORE = "scienceScore";
    public static final String READING_SCORE = "readingScore";
    public static final String COMPOSITE_SCORE = "compositeScore";
    public static final String WRITING_SCORE = "writingScore";

    /*
     * WORK
     */
    public static final String P_USERID = "p_userID";
    public static final String P_COMPANYID = "p_companyID";
    public static final String P_COMPANYNAME = "p_companyName";
    public static final String P_COMPANYTITLE = "p_companyTitle";
    public static final String P_COURSE = "p_course";
    public static final String P_ADDRESSID = "p_addressID";
    public static final String P_STREETNAME = "p_streetName";
    public static final String P_CITY = "p_city";
    public static final String P_STATE = "p_state";
    public static final String P_STATEID = "p_stateID";
    public static final String P_ZIP = "p_zip";
    public static final String P_COUNTRY = "p_country";
    public static final String P_COUNTRYID = "p_countryID";
    public static final String P_STARTDATE = "p_startDate";
    public static final String P_ENDDATE = "p_endDate";
    public static final String P_COMPANYDESCRIPTION = "p_companyDescription";

    public static final String USER_WORK_ID = "userWorkId";
    public static final String USER_WORK_ID_CAP = "userWorkID";
    public static final String COMPANY_NAME = "companyName";
    public static final String DESCRIPTION = "description";
    public static final String CREATED_DATE = "createdDate";
    public static final String COMPANY_ID = "companyId";
    public static final String ADDRESS1 = "address1";
    public static final String ADDRESS2 = "address2";
    public static final String START_DATE = "startDate";
    public static final String END_DATE = "endDate";
    public static final String UPDATED_DATE = "updatedDate";
    public static final String COURSE = "course";







    /*
     * CHECKLIST
     */

    public static final String CHECKLISTID = "checklistID";
    public static final String SUB_CHECKLISTID = "subChecklistID";
    public static final String CONTENT = "content";
    public static final String TITLE = "title";
    public static final String STATUS = "status";
    public static final String TASK_ID = "taskID";
    public static final String USERPREFERENCEID = "userPreferenceID";
    public static final String USERINSTITUTIONID = "userInstitutionId";
    public static final String COURSEID = "courseID";

    public static final String COUNTRY_FOR_STUDY="countryForStudy";
    public static final String LEVEL_OF_EDUCATION="levelOfEducation";
    public static final String COURSE_YEAR_PLAN="courseYearPlanning";
    public static final String PREFERED_SEASON="preferedSeason";
    public static final String CURRENT_DEGREE="currentDegree";
    public static final String CURRENT_DEGREE_TYPE="currentDegreeType";
    public static final String ACADEMIC_SCORE="academicScore";
    public static final String ENGLISH_PROFICIENT_TEST_TYPE="englishProficientTestType";
    public static final String ENGLISH_PROFICIENT_TEST_SCORE="englishProficientTestScore";
    public static final String ENGLISH_PROFICIENT_TEST_WRITING="englishProficientTestWriting";
    public static final String ENGLISH_PROFICIENT_TEST_SPEAKING="englishProficientTestSpeaking";
    public static final String ENGLISH_PROFICIENT_TEST_READING="englishProficientTestReading";
    public static final String ENGLISH_PROFICIENT_TEST_LISTENING="englishProficientTestListening";
    public static final String ENTRANCE_TEST="entranceTest";
    public static final String ENTRANCE_TEST_SCORE="entranceTestScore";
    public static final String ENTRANCE_TEST_VERBAL="entranceTestVerbal";
    public static final String ENTRANCE_TEST_QUANTITIVE="entranceTestQuantitive";
    public static final String ENTRANCE_TEST_WRITING="entranceTestWriting";
    public static final String ENTRANCE_TEST_EXAM_DATE="entranceTestExamDate";
    public static final String INTEREST_FREE_STUDY_COURSE_LIST="interestFreeStudyCounselling";
    public static final String DEGREE_WANT_TO_ATTEND="degreeWantToAttend";
    public static final String PROGRAM_WANT_TO_ATTEND="programWantToAttend";
    public static final String WHATSAPPNO="whatsappNumber";
    public static final String TUTIONBUDGETMINVAL="tutionBudgetMinVal";
    public static final String TUTIONBUDGETMAXVAL="tutionBudgetMaxVal";


    public static final String ATTACHMENT_TYPE="attachmentType";
    public static final String ATTACHMENT_ID="attachmentId";
    public static final String CREATEDBY="createdBy";
    public static final String UPDATEDBY="updatedBy";
    public static final String INSTITUTIONID="institutionId";
    public static final String RECOMMENDATIONID="recommendationId";
}
