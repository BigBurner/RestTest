--------------------------------------------------------
--  DDL for Trigger UT_LIB_DYN_QUERIES
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "UT_LIB_DYN_QUERIES" 
BEFORE INSERT ON UT_LIB_DYN_QUERIES
FOR EACH ROW 
BEGIN
  if (:NEW.LIB_DYN_QUERY_ID is null or :NEW.LIB_DYN_QUERY_ID = '') then
      SELECT  SYS_GUID() INTO :NEW.LIB_DYN_QUERY_ID FROM DUAL;
  end if;
  if (:NEW.CREATED_ON is null or :NEW.CREATED_ON = '') then
      SELECT sysdate INTO :NEW.CREATED_ON FROM DUAL;
  end if;
  if (:NEW.CREATED_BY is null or :NEW.CREATED_BY = '') then
      SELECT user INTO :NEW.CREATED_BY FROM DUAL;
  end if;
  if (:NEW.UPDATED_ON is null or :NEW.UPDATED_ON = '') then
      SELECT sysdate INTO :NEW.UPDATED_ON FROM DUAL;
  end if;
  if (:NEW.UPDATED_BY is null or :NEW.UPDATED_BY = '') then
      SELECT user INTO :NEW.UPDATED_BY FROM DUAL;
  end if;
END;
/
ALTER TRIGGER "UT_LIB_DYN_QUERIES" ENABLE;
--------------------------------------------------------
--  DDL for Trigger UT_LIB_DYN_QUERIES_UP_TRG
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "UT_LIB_DYN_QUERIES_UP_TRG" 
BEFORE UPDATE ON UT_LIB_DYN_QUERIES
FOR EACH ROW 
BEGIN
  if (:NEW.UPDATED_ON is null or :NEW.UPDATED_ON = '') then
      SELECT sysdate INTO :NEW.UPDATED_ON FROM DUAL;
  end if;
  if (:NEW.UPDATED_BY is null or :NEW.UPDATED_BY = '') then
      SELECT user INTO :NEW.UPDATED_BY FROM DUAL;
  end if;
END;
/
ALTER TRIGGER "UT_LIB_DYN_QUERIES_UP_TRG" ENABLE;
--------------------------------------------------------
--  DDL for Trigger UT_LIB_STARTUPS
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "UT_LIB_STARTUPS" 
BEFORE INSERT ON UT_LIB_STARTUPS
FOR EACH ROW 
BEGIN
  if (:NEW.LIB_STARTUP_ID is null or :NEW.LIB_STARTUP_ID = '') then
      SELECT  SYS_GUID() INTO :NEW.LIB_STARTUP_ID FROM DUAL;
  end if;
  if (:NEW.CREATED_ON is null or :NEW.CREATED_ON = '') then
      SELECT sysdate INTO :NEW.CREATED_ON FROM DUAL;
  end if;
  if (:NEW.CREATED_BY is null or :NEW.CREATED_BY = '') then
      SELECT user INTO :NEW.CREATED_BY FROM DUAL;
  end if;
  if (:NEW.UPDATED_ON is null or :NEW.UPDATED_ON = '') then
      SELECT sysdate INTO :NEW.UPDATED_ON FROM DUAL;
  end if;
  if (:NEW.UPDATED_BY is null or :NEW.UPDATED_BY = '') then
      SELECT user INTO :NEW.UPDATED_BY FROM DUAL;
  end if;
END;
/
ALTER TRIGGER "UT_LIB_STARTUPS" ENABLE;
--------------------------------------------------------
--  DDL for Trigger UT_LIB_STARTUPS_UP_TRG
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "UT_LIB_STARTUPS_UP_TRG" 
BEFORE UPDATE ON UT_LIB_STARTUPS
FOR EACH ROW 
BEGIN
  if (:NEW.UPDATED_ON is null or :NEW.UPDATED_ON = '') then
      SELECT sysdate INTO :NEW.UPDATED_ON FROM DUAL;
  end if;
  if (:NEW.UPDATED_BY is null or :NEW.UPDATED_BY = '') then
      SELECT user INTO :NEW.UPDATED_BY FROM DUAL;
  end if;
END;
/
ALTER TRIGGER "UT_LIB_STARTUPS_UP_TRG" ENABLE;
--------------------------------------------------------
--  DDL for Trigger UT_LIB_TEARDOWNS
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "UT_LIB_TEARDOWNS" 
BEFORE INSERT ON UT_LIB_TEARDOWNS
FOR EACH ROW 
BEGIN
  if (:NEW.LIB_TEARDOWN_ID is null or :NEW.LIB_TEARDOWN_ID = '') then
      SELECT  SYS_GUID() INTO :NEW.LIB_TEARDOWN_ID FROM DUAL;
  end if;
  if (:NEW.CREATED_ON is null or :NEW.CREATED_ON = '') then
      SELECT sysdate INTO :NEW.CREATED_ON FROM DUAL;
  end if;
  if (:NEW.CREATED_BY is null or :NEW.CREATED_BY = '') then
      SELECT user INTO :NEW.CREATED_BY FROM DUAL;
  end if;
  if (:NEW.UPDATED_ON is null or :NEW.UPDATED_ON = '') then
      SELECT sysdate INTO :NEW.UPDATED_ON FROM DUAL;
  end if;
  if (:NEW.UPDATED_BY is null or :NEW.UPDATED_BY = '') then
      SELECT user INTO :NEW.UPDATED_BY FROM DUAL;
  end if;
END;
/
ALTER TRIGGER "UT_LIB_TEARDOWNS" ENABLE;
--------------------------------------------------------
--  DDL for Trigger UT_LIB_TEARDOWNS_UP_TRG
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "UT_LIB_TEARDOWNS_UP_TRG" 
BEFORE UPDATE ON UT_LIB_TEARDOWNS
FOR EACH ROW 
BEGIN
  if (:NEW.UPDATED_ON is null or :NEW.UPDATED_ON = '') then
      SELECT sysdate INTO :NEW.UPDATED_ON FROM DUAL;
  end if;
  if (:NEW.UPDATED_BY is null or :NEW.UPDATED_BY = '') then
      SELECT user INTO :NEW.UPDATED_BY FROM DUAL;
  end if;
END;
/
ALTER TRIGGER "UT_LIB_TEARDOWNS_UP_TRG" ENABLE;
--------------------------------------------------------
--  DDL for Trigger UT_LIB_VALIDATIONS
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "UT_LIB_VALIDATIONS" 
BEFORE INSERT ON UT_LIB_VALIDATIONS
FOR EACH ROW 
BEGIN
  if (:NEW.LIB_VALIDATION_ID is null or :NEW.LIB_VALIDATION_ID = '') then
      SELECT  SYS_GUID() INTO :NEW.LIB_VALIDATION_ID FROM DUAL;
  end if;
  if (:NEW.CREATED_ON is null or :NEW.CREATED_ON = '') then
      SELECT sysdate INTO :NEW.CREATED_ON FROM DUAL;
  end if;
  if (:NEW.CREATED_BY is null or :NEW.CREATED_BY = '') then
      SELECT user INTO :NEW.CREATED_BY FROM DUAL;
  end if;
  if (:NEW.UPDATED_ON is null or :NEW.UPDATED_ON = '') then
      SELECT sysdate INTO :NEW.UPDATED_ON FROM DUAL;
  end if;
  if (:NEW.UPDATED_BY is null or :NEW.UPDATED_BY = '') then
      SELECT user INTO :NEW.UPDATED_BY FROM DUAL;
  end if;
END;
/
ALTER TRIGGER "UT_LIB_VALIDATIONS" ENABLE;
--------------------------------------------------------
--  DDL for Trigger UT_LIB_VALIDATIONS_UP_TRG
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "UT_LIB_VALIDATIONS_UP_TRG" 
BEFORE UPDATE ON UT_LIB_VALIDATIONS
FOR EACH ROW 
BEGIN
  if (:NEW.UPDATED_ON is null or :NEW.UPDATED_ON = '') then
      SELECT sysdate INTO :NEW.UPDATED_ON FROM DUAL;
  end if;
  if (:NEW.UPDATED_BY is null or :NEW.UPDATED_BY = '') then
      SELECT user INTO :NEW.UPDATED_BY FROM DUAL;
  end if;
END;
/
ALTER TRIGGER "UT_LIB_VALIDATIONS_UP_TRG" ENABLE;
--------------------------------------------------------
--  DDL for Trigger UT_LOOKUP_CAT_TRG
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "UT_LOOKUP_CAT_TRG" 
BEFORE INSERT ON UT_LOOKUP_CATEGORIES
FOR EACH ROW 
BEGIN
  if (:NEW.ID is null or :NEW.ID = '') then
      SELECT  SYS_GUID() INTO :NEW.ID FROM DUAL;
  end if;
  if (:NEW.CREATED_ON is null or :NEW.CREATED_ON = '') then
      SELECT sysdate INTO :NEW.CREATED_ON FROM DUAL;
  end if;
  if (:NEW.CREATED_BY is null or :NEW.CREATED_BY = '') then
      SELECT user INTO :NEW.CREATED_BY FROM DUAL;
  end if;
  if (:NEW.UPDATED_ON is null or :NEW.UPDATED_ON = '') then
      SELECT sysdate INTO :NEW.UPDATED_ON FROM DUAL;
  end if;
  if (:NEW.UPDATED_BY is null or :NEW.UPDATED_BY = '') then
      SELECT user INTO :NEW.UPDATED_BY FROM DUAL;
  end if;
END;
/
ALTER TRIGGER "UT_LOOKUP_CAT_TRG" ENABLE;
--------------------------------------------------------
--  DDL for Trigger UT_LOOKUP_CAT_UP_TRG
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "UT_LOOKUP_CAT_UP_TRG" 
BEFORE UPDATE ON UT_LOOKUP_CATEGORIES
FOR EACH ROW 
BEGIN
  if (:NEW.UPDATED_ON is null or :NEW.UPDATED_ON = '') then
      SELECT sysdate INTO :NEW.UPDATED_ON FROM DUAL;
  end if;
  if (:NEW.UPDATED_BY is null or :NEW.UPDATED_BY = '') then
      SELECT user INTO :NEW.UPDATED_BY FROM DUAL;
  end if;
END;
/
ALTER TRIGGER "UT_LOOKUP_CAT_UP_TRG" ENABLE;
--------------------------------------------------------
--  DDL for Trigger UT_LOOKUP_DATATYPES_UP_TRG
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "UT_LOOKUP_DATATYPES_UP_TRG" 
BEFORE UPDATE ON UT_LOOKUP_DATATYPES
FOR EACH ROW 
BEGIN
  if (:NEW.UPDATED_ON is null or :NEW.UPDATED_ON = '') then
      SELECT sysdate INTO :NEW.UPDATED_ON FROM DUAL;
  end if;
  if (:NEW.UPDATED_BY is null or :NEW.UPDATED_BY = '') then
      SELECT user INTO :NEW.UPDATED_BY FROM DUAL;
  end if;
END;
/
ALTER TRIGGER "UT_LOOKUP_DATATYPES_UP_TRG" ENABLE;
--------------------------------------------------------
--  DDL for Trigger UT_LOOKUP_DATA_TRG
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "UT_LOOKUP_DATA_TRG" 
BEFORE INSERT ON UT_LOOKUP_DATATYPES
FOR EACH ROW 
BEGIN
  if (:NEW.ID is null or :NEW.ID = '') then
      SELECT  SYS_GUID() INTO :NEW.ID FROM DUAL;
  end if;
  if (:NEW.CREATED_ON is null or :NEW.CREATED_ON = '') then
      SELECT sysdate INTO :NEW.CREATED_ON FROM DUAL;
  end if;
  if (:NEW.CREATED_BY is null or :NEW.CREATED_BY = '') then
      SELECT user INTO :NEW.CREATED_BY FROM DUAL;
  end if;
  if (:NEW.UPDATED_ON is null or :NEW.UPDATED_ON = '') then
      SELECT sysdate INTO :NEW.UPDATED_ON FROM DUAL;
  end if;
  if (:NEW.UPDATED_BY is null or :NEW.UPDATED_BY = '') then
      SELECT user INTO :NEW.UPDATED_BY FROM DUAL;
  end if;
END;
/
ALTER TRIGGER "UT_LOOKUP_DATA_TRG" ENABLE;
--------------------------------------------------------
--  DDL for Trigger UT_LOOKUP_VALUES_UP_TRG
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "UT_LOOKUP_VALUES_UP_TRG" 
BEFORE UPDATE ON UT_LOOKUP_VALUES
FOR EACH ROW 
BEGIN
  if (:NEW.UPDATED_ON is null or :NEW.UPDATED_ON = '') then
      SELECT sysdate INTO :NEW.UPDATED_ON FROM DUAL;
  end if;
  if (:NEW.UPDATED_BY is null or :NEW.UPDATED_BY = '') then
      SELECT user INTO :NEW.UPDATED_BY FROM DUAL;
  end if;
END;
/
ALTER TRIGGER "UT_LOOKUP_VALUES_UP_TRG" ENABLE;
--------------------------------------------------------
--  DDL for Trigger UT_LOOKUP_VALUE_TRG
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "UT_LOOKUP_VALUE_TRG" 
BEFORE INSERT ON UT_LOOKUP_VALUES
FOR EACH ROW 
BEGIN
  if (:NEW.ID is null or :NEW.ID = '') then
      SELECT  SYS_GUID() INTO :NEW.ID FROM DUAL;
  end if;
  if (:NEW.CREATED_ON is null or :NEW.CREATED_ON = '') then
      SELECT sysdate INTO :NEW.CREATED_ON FROM DUAL;
  end if;
  if (:NEW.CREATED_BY is null or :NEW.CREATED_BY = '') then
      SELECT user INTO :NEW.CREATED_BY FROM DUAL;
  end if;
  if (:NEW.UPDATED_ON is null or :NEW.UPDATED_ON = '') then
      SELECT sysdate INTO :NEW.UPDATED_ON FROM DUAL;
  end if;
  if (:NEW.UPDATED_BY is null or :NEW.UPDATED_BY = '') then
      SELECT user INTO :NEW.UPDATED_BY FROM DUAL;
  end if;
END;
/
ALTER TRIGGER "UT_LOOKUP_VALUE_TRG" ENABLE;
--------------------------------------------------------
--  DDL for Trigger UT_STARTUPS_TRG
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "UT_STARTUPS_TRG" BEFORE
  INSERT ON UT_STARTUPS FOR EACH ROW 
  DECLARE
   BAD_DATA EXCEPTION;
   PRAGMA EXCEPTION_INIT(BAD_DATA, -20201);
  BEGIN 
IF (:NEW.UT_ID IS NULL AND :NEW.UT_SID IS NULL ) THEN
    RAISE_APPLICATION_ERROR(-20201, 'Invalid Insert');
END IF;
IF (:NEW.UT_ID IS NOT NULL AND :NEW.UT_SID IS NOT NULL ) THEN
    RAISE_APPLICATION_ERROR(-20201, 'Invalid Insert');
END IF;
IF (:NEW.STARTUP_ID IS NULL OR :NEW.STARTUP_ID = '' ) THEN
  SELECT SYS_GUID() INTO :NEW.STARTUP_ID FROM DUAL;
END IF;
IF (:NEW.CREATED_ON IS NULL OR :NEW.CREATED_ON = '') THEN
  SELECT sysdate INTO :NEW.CREATED_ON FROM DUAL;
END IF;
IF (:NEW.CREATED_BY IS NULL OR :NEW.CREATED_BY = '') THEN
  SELECT USER INTO :NEW.CREATED_BY FROM DUAL;
END IF;
IF (:NEW.UPDATED_ON IS NULL OR :NEW.UPDATED_ON = '') THEN
  SELECT sysdate INTO :NEW.UPDATED_ON FROM DUAL;
END IF;
IF (:NEW.UPDATED_BY IS NULL OR :NEW.UPDATED_BY = '') THEN
  SELECT USER INTO :NEW.UPDATED_BY FROM DUAL;
END IF;
END;
/
ALTER TRIGGER "UT_STARTUPS_TRG" ENABLE;
--------------------------------------------------------
--  DDL for Trigger UT_STARTUPS_UP_TRG
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "UT_STARTUPS_UP_TRG" BEFORE
  UPDATE ON UT_STARTUPS FOR EACH ROW BEGIN IF (:NEW.UPDATED_ON IS NULL
  OR :NEW.UPDATED_ON = '') THEN
  SELECT sysdate INTO :NEW.UPDATED_ON FROM DUAL;
END IF;
IF (:NEW.UPDATED_BY IS NULL OR :NEW.UPDATED_BY = '') THEN
  SELECT USER INTO :NEW.UPDATED_BY FROM DUAL;
END IF;
END;
/
ALTER TRIGGER "UT_STARTUPS_UP_TRG" ENABLE;
--------------------------------------------------------
--  DDL for Trigger UT_SUITE_ITEMS_TRG
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "UT_SUITE_ITEMS_TRG" 
BEFORE INSERT ON UT_SUITE_ITEMS
FOR EACH ROW 
BEGIN
  if (:NEW.CREATED_ON is null or :NEW.CREATED_ON = '') then
      SELECT sysdate INTO :NEW.CREATED_ON FROM DUAL;
  end if;
  if (:NEW.CREATED_BY is null or :NEW.CREATED_BY = '') then
      SELECT user INTO :NEW.CREATED_BY FROM DUAL;
  end if;
  if (:NEW.UPDATED_ON is null or :NEW.UPDATED_ON = '') then
      SELECT sysdate INTO :NEW.UPDATED_ON FROM DUAL;
  end if;
  if (:NEW.UPDATED_BY is null or :NEW.UPDATED_BY = '') then
      SELECT user INTO :NEW.UPDATED_BY FROM DUAL;
  end if;
END;
/
ALTER TRIGGER "UT_SUITE_ITEMS_TRG" ENABLE;
--------------------------------------------------------
--  DDL for Trigger UT_SUITE_ITEMS_UP_TRG
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "UT_SUITE_ITEMS_UP_TRG" 
BEFORE UPDATE ON UT_SUITE_ITEMS
FOR EACH ROW 
BEGIN
  if (:NEW.UPDATED_ON is null or :NEW.UPDATED_ON = '') then
      SELECT sysdate INTO :NEW.UPDATED_ON FROM DUAL;
  end if;
  if (:NEW.UPDATED_BY is null or :NEW.UPDATED_BY = '') then
      SELECT user INTO :NEW.UPDATED_BY FROM DUAL;
  end if;
END;
/
ALTER TRIGGER "UT_SUITE_ITEMS_UP_TRG" ENABLE;
--------------------------------------------------------
--  DDL for Trigger UT_SUITE_ITEM_RESULTS_TRG
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "UT_SUITE_ITEM_RESULTS_TRG" 
BEFORE INSERT ON UT_SUITE_ITEM_RESULTS
FOR EACH ROW 
BEGIN
  if (:NEW.CREATED_ON is null or :NEW.CREATED_ON = '') then
      SELECT sysdate INTO :NEW.CREATED_ON FROM DUAL;
  end if;
  if (:NEW.CREATED_BY is null or :NEW.CREATED_BY = '') then
      SELECT user INTO :NEW.CREATED_BY FROM DUAL;
  end if;
  if (:NEW.UPDATED_ON is null or :NEW.UPDATED_ON = '') then
      SELECT sysdate INTO :NEW.UPDATED_ON FROM DUAL;
  end if;
  if (:NEW.UPDATED_BY is null or :NEW.UPDATED_BY = '') then
      SELECT user INTO :NEW.UPDATED_BY FROM DUAL;
  end if;
END;
/
ALTER TRIGGER "UT_SUITE_ITEM_RESULTS_TRG" ENABLE;
--------------------------------------------------------
--  DDL for Trigger UT_SUITE_ITEM_RESULTS_UP_TRG
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "UT_SUITE_ITEM_RESULTS_UP_TRG" 
BEFORE UPDATE ON UT_SUITE_ITEM_RESULTS
FOR EACH ROW 
BEGIN
  if (:NEW.UPDATED_ON is null or :NEW.UPDATED_ON = '') then
      SELECT sysdate INTO :NEW.UPDATED_ON FROM DUAL;
  end if;
  if (:NEW.UPDATED_BY is null or :NEW.UPDATED_BY = '') then
      SELECT user INTO :NEW.UPDATED_BY FROM DUAL;
  end if;
END;
/
ALTER TRIGGER "UT_SUITE_ITEM_RESULTS_UP_TRG" ENABLE;
--------------------------------------------------------
--  DDL for Trigger UT_SUITE_RESULTS_TRG
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "UT_SUITE_RESULTS_TRG" 
BEFORE INSERT ON UT_SUITE_RESULTS
FOR EACH ROW 
BEGIN
  if (:NEW.UTSR_ID is null or :NEW.UTSR_ID = '') then 
      SELECT  SYS_GUID() INTO :NEW.UTSR_ID FROM DUAL;
  end if;
  if (:NEW.RUN_DATE is null or :NEW.RUN_DATE = '') then 
      SELECT Current_Timestamp INTO :NEW.RUN_DATE FROM DUAL;
  end if;
  if (:NEW.STATUS is null or :NEW.STATUS = '') then 
      :NEW.STATUS := 'RUNNING';
  end if;
  if (:NEW.CREATED_ON is null or :NEW.CREATED_ON = '') then
      SELECT sysdate INTO :NEW.CREATED_ON FROM DUAL;
  end if;
  if (:NEW.CREATED_BY is null or :NEW.CREATED_BY = '') then
      SELECT user INTO :NEW.CREATED_BY FROM DUAL;
  end if;
  if (:NEW.UPDATED_ON is null or :NEW.UPDATED_ON = '') then
      SELECT sysdate INTO :NEW.UPDATED_ON FROM DUAL;
  end if;
  if (:NEW.UPDATED_BY is null or :NEW.UPDATED_BY = '') then
      SELECT user INTO :NEW.UPDATED_BY FROM DUAL;
  end if;
END;
/
ALTER TRIGGER "UT_SUITE_RESULTS_TRG" ENABLE;
--------------------------------------------------------
--  DDL for Trigger UT_SUITE_RESULTS_UP_TRG
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "UT_SUITE_RESULTS_UP_TRG" 
BEFORE UPDATE ON UT_SUITE_RESULTS
FOR EACH ROW 
BEGIN
  if (:NEW.UPDATED_ON is null or :NEW.UPDATED_ON = '') then
      SELECT sysdate INTO :NEW.UPDATED_ON FROM DUAL;
  end if;
  if (:NEW.UPDATED_BY is null or :NEW.UPDATED_BY = '') then
      SELECT user INTO :NEW.UPDATED_BY FROM DUAL;
  end if;
END;
/
ALTER TRIGGER "UT_SUITE_RESULTS_UP_TRG" ENABLE;
--------------------------------------------------------
--  DDL for Trigger UT_SUITE_TRG
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "UT_SUITE_TRG" 
BEFORE INSERT ON UT_SUITE
FOR EACH ROW 
BEGIN
  if (:NEW.UT_SID is null or :NEW.UT_SID = '') then 
      SELECT  SYS_GUID() INTO :NEW.UT_SID FROM DUAL;
  end if;
  if (:NEW.CREATED_ON is null or :NEW.CREATED_ON = '') then
      SELECT sysdate INTO :NEW.CREATED_ON FROM DUAL;
  end if;
  if (:NEW.CREATED_BY is null or :NEW.CREATED_BY = '') then
      SELECT user INTO :NEW.CREATED_BY FROM DUAL;
  end if;
  if (:NEW.UPDATED_ON is null or :NEW.UPDATED_ON = '') then
      SELECT sysdate INTO :NEW.UPDATED_ON FROM DUAL;
  end if;
  if (:NEW.UPDATED_BY is null or :NEW.UPDATED_BY = '') then
      SELECT user INTO :NEW.UPDATED_BY FROM DUAL;
  end if;
END;
/
ALTER TRIGGER "UT_SUITE_TRG" ENABLE;
--------------------------------------------------------
--  DDL for Trigger UT_SUITE_UP_TRG
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "UT_SUITE_UP_TRG" 
BEFORE UPDATE ON UT_SUITE
FOR EACH ROW 
BEGIN
  if (:NEW.UPDATED_ON is null or :NEW.UPDATED_ON = '') then
      SELECT sysdate INTO :NEW.UPDATED_ON FROM DUAL;
  end if;
  if (:NEW.UPDATED_BY is null or :NEW.UPDATED_BY = '') then
      SELECT user INTO :NEW.UPDATED_BY FROM DUAL;
  end if;
END;
/
ALTER TRIGGER "UT_SUITE_UP_TRG" ENABLE;
--------------------------------------------------------
--  DDL for Trigger UT_TEARDOWNS_TRG
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "UT_TEARDOWNS_TRG" BEFORE
INSERT ON UT_TEARDOWNS FOR EACH ROW 
DECLARE
 BAD_DATA EXCEPTION;
 PRAGMA EXCEPTION_INIT(BAD_DATA, -20201);
BEGIN 
IF (:NEW.UT_ID IS NULL AND :NEW.UT_SID IS NULL ) THEN
    RAISE_APPLICATION_ERROR(-20201, 'Invalid Insert');
END IF;
IF (:NEW.UT_ID IS NOT NULL AND :NEW.UT_SID IS NOT NULL ) THEN
    RAISE_APPLICATION_ERROR(-20201, 'Invalid Insert');
END IF;
IF (:NEW.TEARDOWN_ID IS NULL OR :NEW.TEARDOWN_ID = '') THEN
  SELECT SYS_GUID() INTO :NEW.TEARDOWN_ID FROM DUAL;
END IF;
IF (:NEW.CREATED_ON IS NULL OR :NEW.CREATED_ON = '') THEN
  SELECT sysdate INTO :NEW.CREATED_ON FROM DUAL;
END IF;
IF (:NEW.CREATED_BY IS NULL OR :NEW.CREATED_BY = '') THEN
  SELECT USER INTO :NEW.CREATED_BY FROM DUAL;
END IF;
IF (:NEW.UPDATED_ON IS NULL OR :NEW.UPDATED_ON = '') THEN
  SELECT sysdate INTO :NEW.UPDATED_ON FROM DUAL;
END IF;
IF (:NEW.UPDATED_BY IS NULL OR :NEW.UPDATED_BY = '') THEN
  SELECT USER INTO :NEW.UPDATED_BY FROM DUAL;
END IF;
END;
/
ALTER TRIGGER "UT_TEARDOWNS_TRG" ENABLE;
--------------------------------------------------------
--  DDL for Trigger UT_TEARDOWNS_UP_TRG
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "UT_TEARDOWNS_UP_TRG" BEFORE
  UPDATE ON UT_TEARDOWNS FOR EACH ROW 
BEGIN 
IF (:NEW.UPDATED_ON IS NULL
  OR :NEW.UPDATED_ON = '') THEN
  SELECT sysdate INTO :NEW.UPDATED_ON FROM DUAL;
END IF;
IF (:NEW.UPDATED_BY IS NULL OR :NEW.UPDATED_BY = '') THEN
  SELECT USER INTO :NEW.UPDATED_BY FROM DUAL;
END IF;
END;
/
ALTER TRIGGER "UT_TEARDOWNS_UP_TRG" ENABLE;
--------------------------------------------------------
--  DDL for Trigger UT_TEST_ARGUMENTS_TRG
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "UT_TEST_ARGUMENTS_TRG" 
BEFORE INSERT ON UT_TEST_ARGUMENTS
FOR EACH ROW 
BEGIN
  if (:NEW.CREATED_ON is null or :NEW.CREATED_ON = '') then
      SELECT sysdate INTO :NEW.CREATED_ON FROM DUAL;
  end if;
  if (:NEW.CREATED_BY is null or :NEW.CREATED_BY = '') then
      SELECT user INTO :NEW.CREATED_BY FROM DUAL;
  end if;
  if (:NEW.UPDATED_ON is null or :NEW.UPDATED_ON = '') then
      SELECT sysdate INTO :NEW.UPDATED_ON FROM DUAL;
  end if;
  if (:NEW.UPDATED_BY is null or :NEW.UPDATED_BY = '') then
      SELECT user INTO :NEW.UPDATED_BY FROM DUAL;
  end if;
END;
/
ALTER TRIGGER "UT_TEST_ARGUMENTS_TRG" ENABLE;
--------------------------------------------------------
--  DDL for Trigger UT_TEST_ARGUMENTS_UP_TRG
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "UT_TEST_ARGUMENTS_UP_TRG" 
BEFORE UPDATE ON UT_TEST_ARGUMENTS
FOR EACH ROW 
BEGIN
  if (:NEW.UPDATED_ON is null or :NEW.UPDATED_ON = '') then
      SELECT sysdate INTO :NEW.UPDATED_ON FROM DUAL;
  end if;
  if (:NEW.UPDATED_BY is null or :NEW.UPDATED_BY = '') then
      SELECT user INTO :NEW.UPDATED_BY FROM DUAL;
  end if;
END;
/
ALTER TRIGGER "UT_TEST_ARGUMENTS_UP_TRG" ENABLE;
--------------------------------------------------------
--  DDL for Trigger UT_TEST_COVERAGE_STATS_TRG
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "UT_TEST_COVERAGE_STATS_TRG" 
BEFORE INSERT ON UT_TEST_COVERAGE_STATS
FOR EACH ROW 
BEGIN
  if (:NEW.UTC_ID is null or :NEW.UTC_ID = '') then 
      SELECT  SYS_GUID() INTO :NEW.UTC_ID FROM DUAL;
  end if;
  if (:NEW.CREATED_ON is null or :NEW.CREATED_ON = '') then
      SELECT sysdate INTO :NEW.CREATED_ON FROM DUAL;
  end if;
  if (:NEW.CREATED_BY is null or :NEW.CREATED_BY = '') then
      SELECT user INTO :NEW.CREATED_BY FROM DUAL;
  end if;
  if (:NEW.UPDATED_ON is null or :NEW.UPDATED_ON = '') then
      SELECT sysdate INTO :NEW.UPDATED_ON FROM DUAL;
  end if;
  if (:NEW.UPDATED_BY is null or :NEW.UPDATED_BY = '') then
      SELECT user INTO :NEW.UPDATED_BY FROM DUAL;
  end if;
END;
/
ALTER TRIGGER "UT_TEST_COVERAGE_STATS_TRG" ENABLE;
--------------------------------------------------------
--  DDL for Trigger UT_TEST_COVERAGE_STATS_UP_TRG
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "UT_TEST_COVERAGE_STATS_UP_TRG" 
BEFORE UPDATE ON UT_TEST_COVERAGE_STATS
FOR EACH ROW 
BEGIN
  if (:NEW.UPDATED_ON is null or :NEW.UPDATED_ON = '') then
      SELECT sysdate INTO :NEW.UPDATED_ON FROM DUAL;
  end if;
  if (:NEW.UPDATED_BY is null or :NEW.UPDATED_BY = '') then
      SELECT user INTO :NEW.UPDATED_BY FROM DUAL;
  end if;
END;
/
ALTER TRIGGER "UT_TEST_COVERAGE_STATS_UP_TRG" ENABLE;
--------------------------------------------------------
--  DDL for Trigger UT_TEST_IMPL_ARGUMENTS_TRG
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "UT_TEST_IMPL_ARGUMENTS_TRG" 
BEFORE INSERT ON UT_TEST_IMPL_ARGUMENTS
FOR EACH ROW 
BEGIN
  if (:NEW.CREATED_ON is null or :NEW.CREATED_ON = '') then
      SELECT sysdate INTO :NEW.CREATED_ON FROM DUAL;
  end if;
  if (:NEW.CREATED_BY is null or :NEW.CREATED_BY = '') then
      SELECT user INTO :NEW.CREATED_BY FROM DUAL;
  end if;
  if (:NEW.UPDATED_ON is null or :NEW.UPDATED_ON = '') then
      SELECT sysdate INTO :NEW.UPDATED_ON FROM DUAL;
  end if;
  if (:NEW.UPDATED_BY is null or :NEW.UPDATED_BY = '') then
      SELECT user INTO :NEW.UPDATED_BY FROM DUAL;
  end if;
END;
/
ALTER TRIGGER "UT_TEST_IMPL_ARGUMENTS_TRG" ENABLE;
--------------------------------------------------------
--  DDL for Trigger UT_TEST_IMPL_ARGUMENTS_UP_TRG
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "UT_TEST_IMPL_ARGUMENTS_UP_TRG" 
BEFORE UPDATE ON UT_TEST_IMPL_ARGUMENTS
FOR EACH ROW 
BEGIN
  if (:NEW.UPDATED_ON is null or :NEW.UPDATED_ON = '') then
      SELECT sysdate INTO :NEW.UPDATED_ON FROM DUAL;
  end if;
  if (:NEW.UPDATED_BY is null or :NEW.UPDATED_BY = '') then
      SELECT user INTO :NEW.UPDATED_BY FROM DUAL;
  end if;
END;
/
ALTER TRIGGER "UT_TEST_IMPL_ARGUMENTS_UP_TRG" ENABLE;
--------------------------------------------------------
--  DDL for Trigger UT_TEST_IMPL_ARG_RESULTS_TRG
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "UT_TEST_IMPL_ARG_RESULTS_TRG" 
BEFORE INSERT ON UT_TEST_IMPL_ARG_RESULTS
FOR EACH ROW 
BEGIN
  if (:NEW.UTIAR_ID is null or :NEW.UTIAR_ID = '') then 
      SELECT  SYS_GUID() INTO :NEW.UTIAR_ID FROM DUAL;
  end if;
  if (:NEW.RUN_DATE is null or :NEW.RUN_DATE = '') then 
      SELECT Current_Timestamp INTO :NEW.RUN_DATE FROM DUAL;
  end if;
  if (:NEW.STATUS is null or :NEW.STATUS = '') then 
      :NEW.STATUS := 'RUNNING';
  end if;
  if (:NEW.CREATED_ON is null or :NEW.CREATED_ON = '') then
      SELECT sysdate INTO :NEW.CREATED_ON FROM DUAL;
  end if;
  if (:NEW.CREATED_BY is null or :NEW.CREATED_BY = '') then
      SELECT user INTO :NEW.CREATED_BY FROM DUAL;
  end if;
  if (:NEW.UPDATED_ON is null or :NEW.UPDATED_ON = '') then
      SELECT sysdate INTO :NEW.UPDATED_ON FROM DUAL;
  end if;
  if (:NEW.UPDATED_BY is null or :NEW.UPDATED_BY = '') then
      SELECT user INTO :NEW.UPDATED_BY FROM DUAL;
  end if;
END;
/
ALTER TRIGGER "UT_TEST_IMPL_ARG_RESULTS_TRG" ENABLE;
--------------------------------------------------------
--  DDL for Trigger UT_TEST_IMPL_ARG_RES_UP_TRG
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "UT_TEST_IMPL_ARG_RES_UP_TRG" 
BEFORE UPDATE ON UT_TEST_IMPL_ARG_RESULTS
FOR EACH ROW 
BEGIN
  if (:NEW.UPDATED_ON is null or :NEW.UPDATED_ON = '') then
      SELECT sysdate INTO :NEW.UPDATED_ON FROM DUAL;
  end if;
  if (:NEW.UPDATED_BY is null or :NEW.UPDATED_BY = '') then
      SELECT user INTO :NEW.UPDATED_BY FROM DUAL;
  end if;
END;
/
ALTER TRIGGER "UT_TEST_IMPL_ARG_RES_UP_TRG" ENABLE;
--------------------------------------------------------
--  DDL for Trigger UT_TEST_IMPL_RESULTS_TRG
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "UT_TEST_IMPL_RESULTS_TRG" 
BEFORE INSERT ON UT_TEST_IMPL_RESULTS
FOR EACH ROW 
BEGIN
  if (:NEW.UTIR_ID is null or :NEW.UTIR_ID = '') then 
      SELECT  SYS_GUID() INTO :NEW.UTIR_ID FROM DUAL;
  end if;
  if (:NEW.RUN_DATE is null or :NEW.RUN_DATE = '') then 
      SELECT Current_Timestamp INTO :NEW.RUN_DATE FROM DUAL;
  end if;
  if (:NEW.STATUS is null or :NEW.STATUS = '') then 
      :NEW.STATUS := 'RUNNING';
  end if;
  if (:NEW.CREATED_ON is null or :NEW.CREATED_ON = '') then
      SELECT sysdate INTO :NEW.CREATED_ON FROM DUAL;
  end if;
  if (:NEW.CREATED_BY is null or :NEW.CREATED_BY = '') then
      SELECT user INTO :NEW.CREATED_BY FROM DUAL;
  end if;
  if (:NEW.UPDATED_ON is null or :NEW.UPDATED_ON = '') then
      SELECT sysdate INTO :NEW.UPDATED_ON FROM DUAL;
  end if;
  if (:NEW.UPDATED_BY is null or :NEW.UPDATED_BY = '') then
      SELECT user INTO :NEW.UPDATED_BY FROM DUAL;
  end if;
END;
/
ALTER TRIGGER "UT_TEST_IMPL_RESULTS_TRG" ENABLE;
--------------------------------------------------------
--  DDL for Trigger UT_TEST_IMPL_RESULTS_UP_TRG
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "UT_TEST_IMPL_RESULTS_UP_TRG" 
BEFORE UPDATE ON UT_TEST_IMPL_RESULTS
FOR EACH ROW 
BEGIN
  if (:NEW.UPDATED_ON is null or :NEW.UPDATED_ON = '') then
      SELECT sysdate INTO :NEW.UPDATED_ON FROM DUAL;
  end if;
  if (:NEW.UPDATED_BY is null or :NEW.UPDATED_BY = '') then
      SELECT user INTO :NEW.UPDATED_BY FROM DUAL;
  end if;
END;
/
ALTER TRIGGER "UT_TEST_IMPL_RESULTS_UP_TRG" ENABLE;
--------------------------------------------------------
--  DDL for Trigger UT_TEST_IMPL_TRG
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "UT_TEST_IMPL_TRG" 
BEFORE INSERT ON UT_TEST_IMPL
FOR EACH ROW 
BEGIN
  if (:NEW.UTI_ID is null or :NEW.UTI_ID = '') then
      SELECT  SYS_GUID() INTO :NEW.UTI_ID FROM DUAL;
  end if;
  if (:NEW.CREATED_ON is null or :NEW.CREATED_ON = '') then
      SELECT sysdate INTO :NEW.CREATED_ON FROM DUAL;
  end if;
  if (:NEW.CREATED_BY is null or :NEW.CREATED_BY = '') then
      SELECT user INTO :NEW.CREATED_BY FROM DUAL;
  end if;
  if (:NEW.UPDATED_ON is null or :NEW.UPDATED_ON = '') then
      SELECT sysdate INTO :NEW.UPDATED_ON FROM DUAL;
  end if;
  if (:NEW.UPDATED_BY is null or :NEW.UPDATED_BY = '') then
      SELECT user INTO :NEW.UPDATED_BY FROM DUAL;
  end if;
END;
/
ALTER TRIGGER "UT_TEST_IMPL_TRG" ENABLE;
--------------------------------------------------------
--  DDL for Trigger UT_TEST_IMPL_UP_TRG
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "UT_TEST_IMPL_UP_TRG" 
BEFORE UPDATE ON UT_TEST_IMPL
FOR EACH ROW 
BEGIN
  if (:NEW.UPDATED_ON is null or :NEW.UPDATED_ON = '') then
      SELECT sysdate INTO :NEW.UPDATED_ON FROM DUAL;
  end if;
  if (:NEW.UPDATED_BY is null or :NEW.UPDATED_BY = '') then
      SELECT user INTO :NEW.UPDATED_BY FROM DUAL;
  end if;
END;
/
ALTER TRIGGER "UT_TEST_IMPL_UP_TRG" ENABLE;
--------------------------------------------------------
--  DDL for Trigger UT_TEST_IMPL_VAL_RESULTS_TRG
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "UT_TEST_IMPL_VAL_RESULTS_TRG" 
BEFORE INSERT ON UT_TEST_IMPL_VAL_RESULTS
FOR EACH ROW 
BEGIN
  if (:NEW.UTIVR_ID is null or :NEW.UTIVR_ID = '') then 
      SELECT  SYS_GUID() INTO :NEW.UTIVR_ID FROM DUAL;
  end if;
  if (:NEW.STATUS is null or :NEW.STATUS = '') then 
      :NEW.STATUS := 'RUNNING';
  end if;
  if (:NEW.CREATED_ON is null or :NEW.CREATED_ON = '') then
      SELECT sysdate INTO :NEW.CREATED_ON FROM DUAL;
  end if;
  if (:NEW.CREATED_BY is null or :NEW.CREATED_BY = '') then
      SELECT user INTO :NEW.CREATED_BY FROM DUAL;
  end if;
  if (:NEW.UPDATED_ON is null or :NEW.UPDATED_ON = '') then
      SELECT sysdate INTO :NEW.UPDATED_ON FROM DUAL;
  end if;
  if (:NEW.UPDATED_BY is null or :NEW.UPDATED_BY = '') then
      SELECT user INTO :NEW.UPDATED_BY FROM DUAL;
  end if;
END;
/
ALTER TRIGGER "UT_TEST_IMPL_VAL_RESULTS_TRG" ENABLE;
--------------------------------------------------------
--  DDL for Trigger UT_TEST_IMPL_VAL_RES_UP_TRG
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "UT_TEST_IMPL_VAL_RES_UP_TRG" 
BEFORE UPDATE ON UT_TEST_IMPL_VAL_RESULTS
FOR EACH ROW 
BEGIN
  if (:NEW.UPDATED_ON is null or :NEW.UPDATED_ON = '') then
      SELECT sysdate INTO :NEW.UPDATED_ON FROM DUAL;
  end if;
  if (:NEW.UPDATED_BY is null or :NEW.UPDATED_BY = '') then
      SELECT user INTO :NEW.UPDATED_BY FROM DUAL;
  end if;
END;
/
ALTER TRIGGER "UT_TEST_IMPL_VAL_RES_UP_TRG" ENABLE;
--------------------------------------------------------
--  DDL for Trigger UT_TEST_RESULTS_TRG
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "UT_TEST_RESULTS_TRG" 
BEFORE INSERT ON UT_TEST_RESULTS
FOR EACH ROW 
BEGIN
  if (:NEW.UTR_ID is null or :NEW.UTR_ID = '') then 
      SELECT  SYS_GUID() INTO :NEW.UTR_ID FROM DUAL;
  end if;
  if (:NEW.RUN_DATE is null or :NEW.RUN_DATE = '') then 
      SELECT Current_Timestamp INTO :NEW.RUN_DATE FROM DUAL;
  end if;
  if (:NEW.STATUS is null or :NEW.STATUS = '') then 
      :NEW.STATUS := 'RUNNING';
  end if;
  if (:NEW.CREATED_ON is null or :NEW.CREATED_ON = '') then
      SELECT sysdate INTO :NEW.CREATED_ON FROM DUAL;
  end if;
  if (:NEW.CREATED_BY is null or :NEW.CREATED_BY = '') then
      SELECT user INTO :NEW.CREATED_BY FROM DUAL;
  end if;
  if (:NEW.UPDATED_ON is null or :NEW.UPDATED_ON = '') then
      SELECT sysdate INTO :NEW.UPDATED_ON FROM DUAL;
  end if;
  if (:NEW.UPDATED_BY is null or :NEW.UPDATED_BY = '') then
      SELECT user INTO :NEW.UPDATED_BY FROM DUAL;
  end if;
END;
/
ALTER TRIGGER "UT_TEST_RESULTS_TRG" ENABLE;
--------------------------------------------------------
--  DDL for Trigger UT_TEST_RESULTS_UP_TRG
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "UT_TEST_RESULTS_UP_TRG" 
BEFORE UPDATE ON UT_TEST_RESULTS
FOR EACH ROW 
BEGIN
  if (:NEW.UPDATED_ON is null or :NEW.UPDATED_ON = '') then
      SELECT sysdate INTO :NEW.UPDATED_ON FROM DUAL;
  end if;
  if (:NEW.UPDATED_BY is null or :NEW.UPDATED_BY = '') then
      SELECT user INTO :NEW.UPDATED_BY FROM DUAL;
  end if;
END;
/
ALTER TRIGGER "UT_TEST_RESULTS_UP_TRG" ENABLE;
--------------------------------------------------------
--  DDL for Trigger UT_TEST_TRG
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "UT_TEST_TRG" 
BEFORE INSERT ON UT_TEST
FOR EACH ROW 
BEGIN
  if (:NEW.UT_ID is null or :NEW.UT_ID = '') then 
      SELECT  SYS_GUID() INTO :NEW.UT_ID FROM DUAL;
  end if;
  if (:NEW.CREATED_ON is null or :NEW.CREATED_ON = '') then
      SELECT sysdate INTO :NEW.CREATED_ON FROM DUAL;
  end if;
  if (:NEW.CREATED_BY is null or :NEW.CREATED_BY = '') then
      SELECT user INTO :NEW.CREATED_BY FROM DUAL;
  end if;
  if (:NEW.UPDATED_ON is null or :NEW.UPDATED_ON = '') then
      SELECT sysdate INTO :NEW.UPDATED_ON FROM DUAL;
  end if;
  if (:NEW.UPDATED_BY is null or :NEW.UPDATED_BY = '') then
      SELECT user INTO :NEW.UPDATED_BY FROM DUAL;
  end if;
END;
/
ALTER TRIGGER "UT_TEST_TRG" ENABLE;
--------------------------------------------------------
--  DDL for Trigger UT_TEST_UP_TRG
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "UT_TEST_UP_TRG" 
BEFORE UPDATE ON UT_TEST
FOR EACH ROW 
BEGIN
  if (:NEW.UPDATED_ON is null or :NEW.UPDATED_ON = '') then
      SELECT sysdate INTO :NEW.UPDATED_ON FROM DUAL;
  end if;
  if (:NEW.UPDATED_BY is null or :NEW.UPDATED_BY = '') then
      SELECT user INTO :NEW.UPDATED_BY FROM DUAL;
  end if;
END;
/
ALTER TRIGGER "UT_TEST_UP_TRG" ENABLE;
--------------------------------------------------------
--  DDL for Trigger UT_VALIDATIONS_TRG
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "UT_VALIDATIONS_TRG" 
BEFORE INSERT ON UT_VALIDATIONS
FOR EACH ROW 
BEGIN
  if (:NEW.VALIDATION_ID is null or :NEW.VALIDATION_ID = '') then
      SELECT  SYS_GUID() INTO :NEW.VALIDATION_ID FROM DUAL;
  end if;
  if (:NEW.CREATED_ON is null or :NEW.CREATED_ON = '') then
      SELECT sysdate INTO :NEW.CREATED_ON FROM DUAL;
  end if;
  if (:NEW.CREATED_BY is null or :NEW.CREATED_BY = '') then
      SELECT user INTO :NEW.CREATED_BY FROM DUAL;
  end if;
  if (:NEW.UPDATED_ON is null or :NEW.UPDATED_ON = '') then
      SELECT sysdate INTO :NEW.UPDATED_ON FROM DUAL;
  end if;
  if (:NEW.UPDATED_BY is null or :NEW.UPDATED_BY = '') then
      SELECT user INTO :NEW.UPDATED_BY FROM DUAL;
  end if;
END;
/
ALTER TRIGGER "UT_VALIDATIONS_TRG" ENABLE;
--------------------------------------------------------
--  DDL for Trigger UT_VALIDATIONS_UP_TRG
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "UT_VALIDATIONS_UP_TRG" 
BEFORE UPDATE ON UT_VALIDATIONS
FOR EACH ROW 
BEGIN
  if (:NEW.UPDATED_ON is null or :NEW.UPDATED_ON = '') then
      SELECT sysdate INTO :NEW.UPDATED_ON FROM DUAL;
  end if;
  if (:NEW.UPDATED_BY is null or :NEW.UPDATED_BY = '') then
      SELECT user INTO :NEW.UPDATED_BY FROM DUAL;
  end if;
END;
/
ALTER TRIGGER "UT_VALIDATIONS_UP_TRG" ENABLE;

