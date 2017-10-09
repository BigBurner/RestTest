--------------------------------------------------------
--  DDL for Index UT_LIB_TEARDOWNS_NAME
--------------------------------------------------------

  CREATE UNIQUE INDEX "UT_LIB_TEARDOWNS_NAME" ON "UT_LIB_TEARDOWNS" ("LIB_TEARDOWN_NAME") 
  ;
--------------------------------------------------------
--  DDL for Index UT_SUITE_ITEM_RESULTS_FK1
--------------------------------------------------------

  CREATE INDEX "UT_SUITE_ITEM_RESULTS_FK1" ON "UT_SUITE_ITEM_RESULTS" ("UTSR_ID") 
  ;
--------------------------------------------------------
--  DDL for Index UT_LIB_DYN_QUERIES_NAME
--------------------------------------------------------

  CREATE UNIQUE INDEX "UT_LIB_DYN_QUERIES_NAME" ON "UT_LIB_DYN_QUERIES" ("LIB_DYN_QUERY_NAME") 
  ;
--------------------------------------------------------
--  DDL for Index UT_SUITE_ITEMS_IX2
--------------------------------------------------------

  CREATE INDEX "UT_SUITE_ITEMS_IX2" ON "UT_SUITE_ITEMS" ("UT_NSID") 
  ;
--------------------------------------------------------
--  DDL for Index UT_TEST_IMPL_VAL_RES_IX1
--------------------------------------------------------

  CREATE INDEX "UT_TEST_IMPL_VAL_RES_IX1" ON "UT_TEST_IMPL_VAL_RESULTS" ("VAL_ID") 
  ;
--------------------------------------------------------
--  DDL for Index UT_TEST_ARGUMENTS_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "UT_TEST_ARGUMENTS_PK" ON "UT_TEST_ARGUMENTS" ("ARG_ID") 
  ;
--------------------------------------------------------
--  DDL for Index UT_TEST_IMPL_VAL_RES_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "UT_TEST_IMPL_VAL_RES_PK" ON "UT_TEST_IMPL_VAL_RESULTS" ("UTIVR_ID") 
  ;
--------------------------------------------------------
--  DDL for Index UT_TEST_IMPL_RESULTS_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "UT_TEST_IMPL_RESULTS_PK" ON "UT_TEST_IMPL_RESULTS" ("UTIR_ID") 
  ;
--------------------------------------------------------
--  DDL for Index UT_LOOKUP_DTS_CAT_ID_IX
--------------------------------------------------------

  CREATE INDEX "UT_LOOKUP_DTS_CAT_ID_IX" ON "UT_LOOKUP_DATATYPES" ("CAT_ID") 
  ;
--------------------------------------------------------
--  DDL for Index UT_TEST_IMPL_UK1
--------------------------------------------------------

  CREATE UNIQUE INDEX "UT_TEST_IMPL_UK1" ON "UT_TEST_IMPL" ("UT_ID", "NAME") 
  ;
--------------------------------------------------------
--  DDL for Index UT_TEST_UK1
--------------------------------------------------------

  CREATE UNIQUE INDEX "UT_TEST_UK1" ON "UT_TEST" ("NAME") 
  ;
--------------------------------------------------------
--  DDL for Index UT_TEST_IMPL_RESULTS_UT_T_IX1
--------------------------------------------------------

  CREATE INDEX "UT_TEST_IMPL_RESULTS_UT_T_IX1" ON "UT_TEST_IMPL_RESULTS" ("UTI_ID") 
  ;
--------------------------------------------------------
--  DDL for Index UT_TEST_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "UT_TEST_PK" ON "UT_TEST" ("UT_ID") 
  ;
--------------------------------------------------------
--  DDL for Index UT_TEARDOWNS_SUITE_IX
--------------------------------------------------------

  CREATE INDEX "UT_TEARDOWNS_SUITE_IX" ON "UT_TEARDOWNS" ("UT_SID") 
  ;
--------------------------------------------------------
--  DDL for Index UT_SUITE_RESULTS_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "UT_SUITE_RESULTS_PK" ON "UT_SUITE_RESULTS" ("UTSR_ID") 
  ;
--------------------------------------------------------
--  DDL for Index UT_SUITE_ITEM_RESULTS_FK3
--------------------------------------------------------

  CREATE INDEX "UT_SUITE_ITEM_RESULTS_FK3" ON "UT_SUITE_ITEM_RESULTS" ("UTR_NSID") 
  ;
--------------------------------------------------------
--  DDL for Index UT_TEST_IMPL_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "UT_TEST_IMPL_PK" ON "UT_TEST_IMPL" ("UTI_ID") 
  ;
--------------------------------------------------------
--  DDL for Index UT_VALIDATIONS_LIB_VALIDN_IX
--------------------------------------------------------

  CREATE INDEX "UT_VALIDATIONS_LIB_VALIDN_IX" ON "UT_VALIDATIONS" ("LIB_VALIDATION_ID") 
  ;
--------------------------------------------------------
--  DDL for Index UT_TEST_IMPL_ARG_RESULTS_IX1
--------------------------------------------------------

  CREATE INDEX "UT_TEST_IMPL_ARG_RESULTS_IX1" ON "UT_TEST_IMPL_ARG_RESULTS" ("UTI_ID") 
  ;
--------------------------------------------------------
--  DDL for Index UT_TEST_IMPL_ARG_RESULTS_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "UT_TEST_IMPL_ARG_RESULTS_PK" ON "UT_TEST_IMPL_ARG_RESULTS" ("UTIAR_ID") 
  ;
--------------------------------------------------------
--  DDL for Index UT_TEST_RESULTS_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "UT_TEST_RESULTS_PK" ON "UT_TEST_RESULTS" ("UTR_ID") 
  ;
--------------------------------------------------------
--  DDL for Index UT_STARTUPS_TEST_IX
--------------------------------------------------------

  CREATE INDEX "UT_STARTUPS_TEST_IX" ON "UT_STARTUPS" ("UT_ID") 
  ;
--------------------------------------------------------
--  DDL for Index UT_TEST_COV_STATS_UT_T_IX1
--------------------------------------------------------

  CREATE INDEX "UT_TEST_COV_STATS_UT_T_IX1" ON "UT_TEST_COVERAGE_STATS" ("UTI_ID") 
  ;
--------------------------------------------------------
--  DDL for Index UT_LOOKUP_CATEGORIES_UK1
--------------------------------------------------------

  CREATE UNIQUE INDEX "UT_LOOKUP_CATEGORIES_UK1" ON "UT_LOOKUP_CATEGORIES" ("NAME") 
  ;
--------------------------------------------------------
--  DDL for Index UT_STARTUPS_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "UT_STARTUPS_PK" ON "UT_STARTUPS" ("STARTUP_ID") 
  ;
--------------------------------------------------------
--  DDL for Index UT_STARTUPS_SUITE_IX
--------------------------------------------------------

  CREATE INDEX "UT_STARTUPS_SUITE_IX" ON "UT_STARTUPS" ("UT_SID") 
  ;
--------------------------------------------------------
--  DDL for Index UT_TEARDOWNS_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "UT_TEARDOWNS_PK" ON "UT_TEARDOWNS" ("TEARDOWN_ID") 
  ;
--------------------------------------------------------
--  DDL for Index UT_SUITE_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "UT_SUITE_PK" ON "UT_SUITE" ("UT_SID") 
  ;
--------------------------------------------------------
--  DDL for Index UT_TEST_IMPL_RESULTS_UT_T_IX2
--------------------------------------------------------

  CREATE INDEX "UT_TEST_IMPL_RESULTS_UT_T_IX2" ON "UT_TEST_IMPL_RESULTS" ("UTR_ID") 
  ;
--------------------------------------------------------
--  DDL for Index UT_LOOKUP_VALUES_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "UT_LOOKUP_VALUES_PK" ON "UT_LOOKUP_VALUES" ("ID") 
  ;
--------------------------------------------------------
--  DDL for Index UT_LIB_TEARDOWNS_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "UT_LIB_TEARDOWNS_PK" ON "UT_LIB_TEARDOWNS" ("LIB_TEARDOWN_ID") 
  ;
--------------------------------------------------------
--  DDL for Index UT_LIB_VALIDATIONS_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "UT_LIB_VALIDATIONS_PK" ON "UT_LIB_VALIDATIONS" ("LIB_VALIDATION_ID") 
  ;
--------------------------------------------------------
--  DDL for Index UT_TEST_IMPL_VAL_RES_IX3
--------------------------------------------------------

  CREATE INDEX "UT_TEST_IMPL_VAL_RES_IX3" ON "UT_TEST_IMPL_VAL_RESULTS" ("UTIR_ID") 
  ;
--------------------------------------------------------
--  DDL for Index UT_SUITE_ITEMS_UK
--------------------------------------------------------

  CREATE UNIQUE INDEX "UT_SUITE_ITEMS_UK" ON "UT_SUITE_ITEMS" ("UT_SID", "UT_ID", "UT_NSID") 
  ;
--------------------------------------------------------
--  DDL for Index UT_LOOKUP_DATATYPES_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "UT_LOOKUP_DATATYPES_PK" ON "UT_LOOKUP_DATATYPES" ("ID") 
  ;
--------------------------------------------------------
--  DDL for Index UT_TEST_IMPL_ARGUMENTS_UT_IX1
--------------------------------------------------------

  CREATE INDEX "UT_TEST_IMPL_ARGUMENTS_UT_IX1" ON "UT_TEST_IMPL_ARGUMENTS" ("ARG_ID") 
  ;
--------------------------------------------------------
--  DDL for Index UT_TEST_ARGUMENTS_IX
--------------------------------------------------------

  CREATE INDEX "UT_TEST_ARGUMENTS_IX" ON "UT_TEST_ARGUMENTS" ("UT_ID") 
  ;
--------------------------------------------------------
--  DDL for Index UT_TEARDOWNS_LIB_VALIDN_IX
--------------------------------------------------------

  CREATE INDEX "UT_TEARDOWNS_LIB_VALIDN_IX" ON "UT_TEARDOWNS" ("LIB_TEARDOWN_ID") 
  ;
--------------------------------------------------------
--  DDL for Index UT_VALIDATIONS_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "UT_VALIDATIONS_PK" ON "UT_VALIDATIONS" ("VALIDATION_ID") 
  ;
--------------------------------------------------------
--  DDL for Index UT_TEST_COV_STATS_UT_T_IX2
--------------------------------------------------------

  CREATE INDEX "UT_TEST_COV_STATS_UT_T_IX2" ON "UT_TEST_COVERAGE_STATS" ("UTIR_ID") 
  ;
--------------------------------------------------------
--  DDL for Index UT_METADATA_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "UT_METADATA_PK" ON "UT_METADATA" ("NAME") 
  ;
--------------------------------------------------------
--  DDL for Index UT_LOOKUP_DATATYPES_UK1
--------------------------------------------------------

  CREATE UNIQUE INDEX "UT_LOOKUP_DATATYPES_UK1" ON "UT_LOOKUP_DATATYPES" ("CAT_ID", "TYPE_STRING") 
  ;
--------------------------------------------------------
--  DDL for Index UT_TEST_IMPL_ARGUMENTS_UT_IX2
--------------------------------------------------------

  CREATE INDEX "UT_TEST_IMPL_ARGUMENTS_UT_IX2" ON "UT_TEST_IMPL_ARGUMENTS" ("UTI_ID") 
  ;
--------------------------------------------------------
--  DDL for Index UT_LIB_STARTUPS_NAME
--------------------------------------------------------

  CREATE UNIQUE INDEX "UT_LIB_STARTUPS_NAME" ON "UT_LIB_STARTUPS" ("LIB_STARTUP_NAME") 
  ;
--------------------------------------------------------
--  DDL for Index UT_TEST_IMPL_UT_TEST_IX
--------------------------------------------------------

  CREATE INDEX "UT_TEST_IMPL_UT_TEST_IX" ON "UT_TEST_IMPL" ("UT_ID") 
  ;
--------------------------------------------------------
--  DDL for Index UT_SUITE_ITEM_RESULTS_FK2
--------------------------------------------------------

  CREATE INDEX "UT_SUITE_ITEM_RESULTS_FK2" ON "UT_SUITE_ITEM_RESULTS" ("UTR_ID") 
  ;
--------------------------------------------------------
--  DDL for Index UT_SUITE_ITEMS_IX1
--------------------------------------------------------

  CREATE INDEX "UT_SUITE_ITEMS_IX1" ON "UT_SUITE_ITEMS" ("UT_SID") 
  ;
--------------------------------------------------------
--  DDL for Index UT_SUITE_ITEMS_IX3
--------------------------------------------------------

  CREATE INDEX "UT_SUITE_ITEMS_IX3" ON "UT_SUITE_ITEMS" ("UT_ID") 
  ;
--------------------------------------------------------
--  DDL for Index UT_STARTUPS_LIB_VALIDN_IX
--------------------------------------------------------

  CREATE INDEX "UT_STARTUPS_LIB_VALIDN_IX" ON "UT_STARTUPS" ("LIB_STARTUP_ID") 
  ;
--------------------------------------------------------
--  DDL for Index UT_VALIDATIONS_TEST_IMPL_IX
--------------------------------------------------------

  CREATE INDEX "UT_VALIDATIONS_TEST_IMPL_IX" ON "UT_VALIDATIONS" ("UTI_ID") 
  ;
--------------------------------------------------------
--  DDL for Index UT_SUITE_RESULTS_IX
--------------------------------------------------------

  CREATE INDEX "UT_SUITE_RESULTS_IX" ON "UT_SUITE_RESULTS" ("UT_SID") 
  ;
--------------------------------------------------------
--  DDL for Index UT_TEST_IMPL_VAL_RES_IX2
--------------------------------------------------------

  CREATE INDEX "UT_TEST_IMPL_VAL_RES_IX2" ON "UT_TEST_IMPL_VAL_RESULTS" ("UTI_ID") 
  ;
--------------------------------------------------------
--  DDL for Index UT_LIB_VALIDATIONS_NAME
--------------------------------------------------------

  CREATE UNIQUE INDEX "UT_LIB_VALIDATIONS_NAME" ON "UT_LIB_VALIDATIONS" ("LIB_VALIDATION_NAME") 
  ;
--------------------------------------------------------
--  DDL for Index UT_TEST_IMPL_ARGUMENTS_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "UT_TEST_IMPL_ARGUMENTS_PK" ON "UT_TEST_IMPL_ARGUMENTS" ("UTI_ID", "ARG_ID") 
  ;
--------------------------------------------------------
--  DDL for Index UT_TEST_IMPL_ARG_RESULTS_IX2
--------------------------------------------------------

  CREATE INDEX "UT_TEST_IMPL_ARG_RESULTS_IX2" ON "UT_TEST_IMPL_ARG_RESULTS" ("ARG_ID") 
  ;
--------------------------------------------------------
--  DDL for Index UT_TEST_IMPL_ARG_RESULTS_IX3
--------------------------------------------------------

  CREATE INDEX "UT_TEST_IMPL_ARG_RESULTS_IX3" ON "UT_TEST_IMPL_ARG_RESULTS" ("UTIR_ID") 
  ;
--------------------------------------------------------
--  DDL for Index UT_LIB_STARTUPS_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "UT_LIB_STARTUPS_PK" ON "UT_LIB_STARTUPS" ("LIB_STARTUP_ID") 
  ;
--------------------------------------------------------
--  DDL for Index UT_TEST_RESULTS_UT_TEST_IX1
--------------------------------------------------------

  CREATE INDEX "UT_TEST_RESULTS_UT_TEST_IX1" ON "UT_TEST_RESULTS" ("UT_ID") 
  ;
--------------------------------------------------------
--  DDL for Index UT_TEST_LIB_DYN_QUERIES_IX
--------------------------------------------------------

  CREATE INDEX "UT_TEST_LIB_DYN_QUERIES_IX" ON "UT_TEST_IMPL" ("LIB_DYN_QUERY_ID") 
  ;
--------------------------------------------------------
--  DDL for Index UT_LOOKUP_CATEGORIES_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "UT_LOOKUP_CATEGORIES_PK" ON "UT_LOOKUP_CATEGORIES" ("ID") 
  ;
--------------------------------------------------------
--  DDL for Index UT_LIB_DYN_QUERIES_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "UT_LIB_DYN_QUERIES_PK" ON "UT_LIB_DYN_QUERIES" ("LIB_DYN_QUERY_ID") 
  ;
--------------------------------------------------------
--  DDL for Index UT_TEST_COVERAGE_STATS_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "UT_TEST_COVERAGE_STATS_PK" ON "UT_TEST_COVERAGE_STATS" ("UTC_ID") 
  ;
--------------------------------------------------------
--  DDL for Index UT_TEARDOWNS_TEST_IX
--------------------------------------------------------

  CREATE INDEX "UT_TEARDOWNS_TEST_IX" ON "UT_TEARDOWNS" ("UT_ID") 
  ;
--------------------------------------------------------
--  DDL for Index UT_SUITE_ITEM_RESULTS_UK
--------------------------------------------------------

  CREATE UNIQUE INDEX "UT_SUITE_ITEM_RESULTS_UK" ON "UT_SUITE_ITEM_RESULTS" ("UTSR_ID", "UTR_ID", "UTR_NSID") 
  ;
--------------------------------------------------------
--  DDL for Index UT_LOOKUP_VALUES_UT_LOOKU_IX
--------------------------------------------------------

  CREATE INDEX "UT_LOOKUP_VALUES_UT_LOOKU_IX" ON "UT_LOOKUP_VALUES" ("DATA_ID") 
  ;
--------------------------------------------------------
--  DDL for Trigger UT_LIB_DYN_QUERIES
--------------------------------------------------------

