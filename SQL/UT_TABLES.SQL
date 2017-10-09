  CREATE TABLE "UT_LIB_DYN_QUERIES" 
   (	"LIB_DYN_QUERY_ID" VARCHAR2(40), 
	"LIB_DYN_QUERY_NAME" VARCHAR2(120), 
	"LIB_DYN_QUERY_CLASS" VARCHAR2(120), 
	"LIB_DYN_QUERY" CLOB, 
	"CREATED_ON" TIMESTAMP (6), 
	"CREATED_BY" VARCHAR2(120), 
	"UPDATED_ON" TIMESTAMP (6), 
	"UPDATED_BY" VARCHAR2(120)
   ) ;
--------------------------------------------------------
--  DDL for Table UT_LIB_STARTUPS
--------------------------------------------------------

  CREATE TABLE "UT_LIB_STARTUPS" 
   (	"LIB_STARTUP_ID" VARCHAR2(40), 
	"LIB_STARTUP_NAME" VARCHAR2(120), 
	"LIB_STARTUP_CLASS" VARCHAR2(120), 
	"LIB_STARTUP" CLOB, 
	"CREATED_ON" TIMESTAMP (6), 
	"CREATED_BY" VARCHAR2(120), 
	"UPDATED_ON" TIMESTAMP (6), 
	"UPDATED_BY" VARCHAR2(120)
   ) ;
--------------------------------------------------------
--  DDL for Table UT_LIB_TEARDOWNS
--------------------------------------------------------

  CREATE TABLE "UT_LIB_TEARDOWNS" 
   (	"LIB_TEARDOWN_ID" VARCHAR2(40), 
	"LIB_TEARDOWN_NAME" VARCHAR2(120), 
	"LIB_TEARDOWN_CLASS" VARCHAR2(120), 
	"LIB_TEARDOWN" CLOB, 
	"CREATED_ON" TIMESTAMP (6), 
	"CREATED_BY" VARCHAR2(120), 
	"UPDATED_ON" TIMESTAMP (6), 
	"UPDATED_BY" VARCHAR2(120)
   ) ;
--------------------------------------------------------
--  DDL for Table UT_LIB_VALIDATIONS
--------------------------------------------------------

  CREATE TABLE "UT_LIB_VALIDATIONS" 
   (	"LIB_VALIDATION_ID" VARCHAR2(40), 
	"LIB_VALIDATION_NAME" VARCHAR2(120), 
	"LIB_VALIDATION_CLASS" VARCHAR2(120), 
	"LIB_VALIDATION" CLOB, 
	"CREATED_ON" TIMESTAMP (6), 
	"CREATED_BY" VARCHAR2(120), 
	"UPDATED_ON" TIMESTAMP (6), 
	"UPDATED_BY" VARCHAR2(120)
   ) ;
--------------------------------------------------------
--  DDL for Table UT_LOOKUP_CATEGORIES
--------------------------------------------------------

  CREATE TABLE "UT_LOOKUP_CATEGORIES" 
   (	"ID" VARCHAR2(40), 
	"NAME" VARCHAR2(120), 
	"CREATED_ON" TIMESTAMP (6), 
	"CREATED_BY" VARCHAR2(120), 
	"UPDATED_ON" TIMESTAMP (6), 
	"UPDATED_BY" VARCHAR2(120)
   ) ;
--------------------------------------------------------
--  DDL for Table UT_LOOKUP_DATATYPES
--------------------------------------------------------

  CREATE TABLE "UT_LOOKUP_DATATYPES" 
   (	"ID" VARCHAR2(40), 
	"CAT_ID" VARCHAR2(40), 
	"TYPE_ID" NUMBER, 
	"TYPE_STRING" VARCHAR2(120), 
	"CREATED_ON" TIMESTAMP (6), 
	"CREATED_BY" VARCHAR2(120), 
	"UPDATED_ON" TIMESTAMP (6), 
	"UPDATED_BY" VARCHAR2(120)
   ) ;
--------------------------------------------------------
--  DDL for Table UT_LOOKUP_VALUES
--------------------------------------------------------

  CREATE TABLE "UT_LOOKUP_VALUES" 
   (	"ID" VARCHAR2(40), 
	"DATA_ID" VARCHAR2(40), 
	"VALUE" CLOB, 
	"CREATED_ON" TIMESTAMP (6), 
	"CREATED_BY" VARCHAR2(120), 
	"UPDATED_ON" TIMESTAMP (6), 
	"UPDATED_BY" VARCHAR2(120)
   ) ;
--------------------------------------------------------
--  DDL for Table UT_METADATA
--------------------------------------------------------

  CREATE TABLE "UT_METADATA" 
   (	"NAME" VARCHAR2(120), 
	"VALUE" VARCHAR2(2000)
   ) ;
--------------------------------------------------------
--  DDL for Table UT_STARTUPS
--------------------------------------------------------

  CREATE TABLE "UT_STARTUPS" 
   (	"STARTUP_ID" VARCHAR2(40), 
	"UT_ID" VARCHAR2(40), 
	"UT_SID" VARCHAR2(40), 
	"INDEX_NO" NUMBER(38,0), 
	"STARTUP" CLOB, 
	"LIB_STARTUP_ID" VARCHAR2(40), 
	"CREATED_ON" TIMESTAMP (6), 
	"CREATED_BY" VARCHAR2(120), 
	"UPDATED_ON" TIMESTAMP (6), 
	"UPDATED_BY" VARCHAR2(120)
   ) ;
--------------------------------------------------------
--  DDL for Table UT_SUITE
--------------------------------------------------------

  CREATE TABLE "UT_SUITE" 
   (	"UT_SID" VARCHAR2(40), 
	"COVERAGE" NUMBER(1,0), 
	"NAME" VARCHAR2(120), 
	"CREATED_ON" TIMESTAMP (6), 
	"CREATED_BY" VARCHAR2(120), 
	"UPDATED_ON" TIMESTAMP (6), 
	"UPDATED_BY" VARCHAR2(120)
   ) ;
--------------------------------------------------------
--  DDL for Table UT_SUITE_ITEMS
--------------------------------------------------------

  CREATE TABLE "UT_SUITE_ITEMS" 
   (	"UT_SID" VARCHAR2(40), 
	"UT_ID" VARCHAR2(40), 
	"UT_NSID" VARCHAR2(40), 
	"RUN_START" VARCHAR2(1), 
	"RUN_TEAR" VARCHAR2(1), 
	"SEQUENCE" NUMBER, 
	"CREATED_ON" TIMESTAMP (6), 
	"CREATED_BY" VARCHAR2(120), 
	"UPDATED_ON" TIMESTAMP (6), 
	"UPDATED_BY" VARCHAR2(120)
   ) ;
--------------------------------------------------------
--  DDL for Table UT_SUITE_ITEM_RESULTS
--------------------------------------------------------

  CREATE TABLE "UT_SUITE_ITEM_RESULTS" 
   ("UTSR_ID" VARCHAR2(40), 
	"UTR_ID" VARCHAR2(40), 
	"UTR_NSID" VARCHAR2(40), 
	"SEQUENCE" NUMBER, 
	"CREATED_ON" TIMESTAMP (6), 
	"CREATED_BY" VARCHAR2(120), 
	"UPDATED_ON" TIMESTAMP (6), 
	"UPDATED_BY" VARCHAR2(120)
   ) ;
--------------------------------------------------------
--  DDL for Table UT_SUITE_RESULTS
--------------------------------------------------------

  CREATE TABLE "UT_SUITE_RESULTS" 
   (	"UTSR_ID" VARCHAR2(40), 
	"UT_SID" VARCHAR2(40), 
	"NAME" VARCHAR2(120), 
	"STATUS" VARCHAR2(20), 
	"MESSAGE" VARCHAR2(2000), 
	"STARTUP_STATUS" VARCHAR2(20), 
	"STARTUP_MESSAGE" VARCHAR2(2000), 
	"STARTUP_START_TIME" VARCHAR2(20), 
	"STARTUP_END_TIME" VARCHAR2(20), 
	"STARTUP_DURATION" NUMBER, 
	"TEARDOWN_STATUS" VARCHAR2(20), 
	"TEARDOWN_MESSAGE" VARCHAR2(2000), 
	"TEARDOWN_START_TIME" VARCHAR2(20), 
	"TEARDOWN_END_TIME" VARCHAR2(20), 
	"TEARDOWN_DURATION" NUMBER, 
	"COVERAGE" NUMBER(1,0), 
	"RUN_DATE" TIMESTAMP (6), 
	"CREATED_ON" TIMESTAMP (6), 
	"CREATED_BY" VARCHAR2(120), 
	"UPDATED_ON" TIMESTAMP (6), 
	"UPDATED_BY" VARCHAR2(120)
   ) ;
--------------------------------------------------------
--  DDL for Table UT_TEARDOWNS
--------------------------------------------------------

  CREATE TABLE "UT_TEARDOWNS" 
   (	"TEARDOWN_ID" VARCHAR2(40), 
	"UT_ID" VARCHAR2(40), 
	"UT_SID" VARCHAR2(40), 
	"INDEX_NO" NUMBER(38,0), 
	"TEARDOWN" CLOB, 
	"LIB_TEARDOWN_ID" VARCHAR2(40), 
	"CREATED_ON" TIMESTAMP (6), 
	"CREATED_BY" VARCHAR2(120), 
	"UPDATED_ON" TIMESTAMP (6), 
	"UPDATED_BY" VARCHAR2(120)
   ) ;
--------------------------------------------------------
--  DDL for Table UT_TEST
--------------------------------------------------------

  CREATE TABLE "UT_TEST" 
   (	"UT_ID" VARCHAR2(40), 
	"NAME" VARCHAR2(120), 
	"OBJECT_NAME" VARCHAR2(120), 
	"OBJECT_TYPE" VARCHAR2(120), 
	"OBJECT_OWNER" VARCHAR2(120), 
	"OBJECT_CALL" VARCHAR2(120), 
	"CONNECTION_NAME" VARCHAR2(120), 
	"COVERAGE" NUMBER(1,0), 
	"CREATED_ON" TIMESTAMP (6), 
	"CREATED_BY" VARCHAR2(120), 
	"UPDATED_ON" TIMESTAMP (6), 
	"UPDATED_BY" VARCHAR2(120)
   ) ;
--------------------------------------------------------
--  DDL for Table UT_TEST_ARGUMENTS
--------------------------------------------------------

  CREATE TABLE "UT_TEST_ARGUMENTS" 
   (	"ARG_ID" VARCHAR2(40), 
	"UT_ID" VARCHAR2(40), 
	"OWNER" VARCHAR2(30), 
	"OBJECT_NAME" VARCHAR2(30), 
	"PACKAGE_NAME" VARCHAR2(30), 
	"OBJECT_ID" NUMBER, 
	"OVERLOAD" VARCHAR2(40), 
	"ARGUMENT_NAME" VARCHAR2(30), 
	"POSITION" NUMBER, 
	"SEQUENCE" NUMBER, 
	"DATA_LEVEL" NUMBER, 
	"DATA_TYPE" VARCHAR2(30), 
	"DEFAULT_LENGTH" NUMBER, 
	"IN_OUT" VARCHAR2(9), 
	"DATA_LENGTH" NUMBER, 
	"DATA_PRECISION" NUMBER, 
	"DATA_SCALE" NUMBER, 
	"RADIX" NUMBER, 
	"CHARACTER_SET_NAME" VARCHAR2(44), 
	"TYPE_OWNER" VARCHAR2(30), 
	"TYPE_NAME" VARCHAR2(30), 
	"TYPE_SUBNAME" VARCHAR2(30), 
	"TYPE_LINK" VARCHAR2(128), 
	"PLS_TYPE" VARCHAR2(30), 
	"CHAR_LENGTH" NUMBER, 
	"CHAR_USED" VARCHAR2(1), 
	"CREATED_ON" TIMESTAMP (6), 
	"CREATED_BY" VARCHAR2(120), 
	"UPDATED_ON" TIMESTAMP (6), 
	"UPDATED_BY" VARCHAR2(120)
   ) ;
--------------------------------------------------------
--  DDL for Table UT_TEST_COVERAGE_STATS
--------------------------------------------------------

  CREATE TABLE "UT_TEST_COVERAGE_STATS" 
   (	"UTC_ID" VARCHAR2(40), 
	"UTIR_ID" VARCHAR2(40), 
	"UTI_ID" VARCHAR2(40), 
	"UNIT_OWNER" VARCHAR2(30), 
	"UNIT_NAME" VARCHAR2(30), 
	"LINE" NUMBER, 
	"TOTAL_OCCUR" NUMBER, 
	"TOTAL_TIME" NUMBER, 
	"TEXT" VARCHAR2(4000), 
	"CREATED_ON" TIMESTAMP (6), 
	"CREATED_BY" VARCHAR2(120), 
	"UPDATED_ON" TIMESTAMP (6), 
	"UPDATED_BY" VARCHAR2(120)
   ) ;
--------------------------------------------------------
--  DDL for Table UT_TEST_IMPL
--------------------------------------------------------

  CREATE TABLE "UT_TEST_IMPL" 
   (	"UTI_ID" VARCHAR2(40), 
	"UT_ID" VARCHAR2(40), 
	"NAME" VARCHAR2(120), 
	"EXPECTED_RETURN" VARCHAR2(20), 
	"EXPECTED_RETURN_ERROR" VARCHAR2(200), 
	"DYNAMIC_VALUE_QUERY" CLOB, 
	"LIB_DYN_QUERY_ID" VARCHAR2(40), 
	"CREATED_ON" TIMESTAMP (6), 
	"CREATED_BY" VARCHAR2(120), 
	"UPDATED_ON" TIMESTAMP (6), 
	"UPDATED_BY" VARCHAR2(120)
   ) ;
--------------------------------------------------------
--  DDL for Table UT_TEST_IMPL_ARGUMENTS
--------------------------------------------------------

  CREATE TABLE "UT_TEST_IMPL_ARGUMENTS" 
   (	"UTI_ID" VARCHAR2(40), 
	"ARG_ID" VARCHAR2(40), 
	"INPUT_VALUE" CLOB, 
	"OUTPUT_VALUE" CLOB, 
	"TEST_OUTVAL" NUMBER(1,0) DEFAULT 1, 
	"CREATED_ON" TIMESTAMP (6), 
	"CREATED_BY" VARCHAR2(120), 
	"UPDATED_ON" TIMESTAMP (6), 
	"UPDATED_BY" VARCHAR2(120)
   ) ;
--------------------------------------------------------
--  DDL for Table UT_TEST_IMPL_ARG_RESULTS
--------------------------------------------------------

  CREATE TABLE "UT_TEST_IMPL_ARG_RESULTS" 
   (	"UTIAR_ID" VARCHAR2(40), 
	"UTIR_ID" VARCHAR2(40), 
	"UTI_ID" VARCHAR2(40), 
	"ARG_ID" VARCHAR2(40), 
	"NAME" VARCHAR2(120), 
	"STATUS" VARCHAR2(20), 
	"MESSAGE" VARCHAR2(2000), 
	"RUN_DATE" TIMESTAMP (6), 
	"CREATED_ON" TIMESTAMP (6), 
	"CREATED_BY" VARCHAR2(120), 
	"UPDATED_ON" TIMESTAMP (6), 
	"UPDATED_BY" VARCHAR2(120)
   ) ;
--------------------------------------------------------
--  DDL for Table UT_TEST_IMPL_RESULTS
--------------------------------------------------------

  CREATE TABLE "UT_TEST_IMPL_RESULTS" 
   (	"UTIR_ID" VARCHAR2(40), 
	"UTI_ID" VARCHAR2(40), 
	"UTR_ID" VARCHAR2(40), 
	"NAME" VARCHAR2(120), 
	"STATUS" VARCHAR2(20), 
	"MESSAGE" VARCHAR2(2000), 
	"START_TIME" VARCHAR2(20), 
	"END_TIME" VARCHAR2(20), 
	"DURATION" NUMBER, 
	"STARTUP_STATUS" VARCHAR2(20), 
	"STARTUP_MESSAGE" VARCHAR2(2000), 
	"STARTUP_START_TIME" VARCHAR2(20), 
	"STARTUP_END_TIME" VARCHAR2(20), 
	"STARTUP_DURATION" NUMBER, 
	"OP_CALL_STATUS" VARCHAR2(20), 
	"OP_CALL_MESSAGE" VARCHAR2(2000), 
	"OP_CALL_START_TIME" VARCHAR2(20), 
	"OP_CALL_END_TIME" VARCHAR2(20), 
	"OP_CALL_DURATION" NUMBER, 
	"TEARDOWN_STATUS" VARCHAR2(20), 
	"TEARDOWN_MESSAGE" VARCHAR2(2000), 
	"TEARDOWN_START_TIME" VARCHAR2(20), 
	"TEARDOWN_END_TIME" VARCHAR2(20), 
	"TEARDOWN_DURATION" NUMBER, 
	"RUN_DATE" TIMESTAMP (6), 
	"CREATED_ON" TIMESTAMP (6), 
	"CREATED_BY" VARCHAR2(120), 
	"UPDATED_ON" TIMESTAMP (6), 
	"UPDATED_BY" VARCHAR2(120)
   ) ;
--------------------------------------------------------
--  DDL for Table UT_TEST_IMPL_VAL_RESULTS
--------------------------------------------------------

  CREATE TABLE "UT_TEST_IMPL_VAL_RESULTS" 
   (	"UTIVR_ID" VARCHAR2(40), 
	"UTIR_ID" VARCHAR2(40), 
	"UTI_ID" VARCHAR2(40), 
	"VAL_ID" VARCHAR2(40), 
	"VAL_TYPE" VARCHAR2(40), 
	"STATUS" VARCHAR2(20), 
	"MESSAGE" VARCHAR2(2000), 
	"VAL_START_TIME" VARCHAR2(20), 
	"VAL_END_TIME" VARCHAR2(20), 
	"VAL_DURATION" NUMBER, 
	"RUN_DATE" TIMESTAMP (6), 
	"CREATED_ON" TIMESTAMP (6), 
	"CREATED_BY" VARCHAR2(120), 
	"UPDATED_ON" TIMESTAMP (6), 
	"UPDATED_BY" VARCHAR2(120)
   ) ;
--------------------------------------------------------
--  DDL for Table UT_TEST_RESULTS
--------------------------------------------------------

  CREATE TABLE "UT_TEST_RESULTS" 
   (	"UTR_ID" VARCHAR2(40), 
	"UT_ID" VARCHAR2(40), 
	"NAME" VARCHAR2(120), 
	"STATUS" VARCHAR2(20), 
	"MESSAGE" VARCHAR2(2000), 
	"COVERAGE" NUMBER(1,0), 
	"TEST_USER_NAME" VARCHAR2(120), 
	"CONNECTION_NAME" VARCHAR2(120), 
	"RUN_DATE" TIMESTAMP (6), 
	"CREATED_ON" TIMESTAMP (6), 
	"CREATED_BY" VARCHAR2(120), 
	"UPDATED_ON" TIMESTAMP (6), 
	"UPDATED_BY" VARCHAR2(120)
   ) ;
--------------------------------------------------------
--  DDL for Table UT_VALIDATIONS
--------------------------------------------------------

  CREATE TABLE "UT_VALIDATIONS" 
   (	"VALIDATION_ID" VARCHAR2(40), 
	"UTI_ID" VARCHAR2(40), 
	"INDEX_NO" NUMBER(38,0), 
	"VALIDATION" CLOB, 
	"LIB_VALIDATION_ID" VARCHAR2(40), 
	"APPLY_VALIDATION" NUMBER(1,0) DEFAULT 1, 
	"CREATED_ON" TIMESTAMP (6), 
	"CREATED_BY" VARCHAR2(120), 
	"UPDATED_ON" TIMESTAMP (6), 
	"UPDATED_BY" VARCHAR2(120)
   ) ;

