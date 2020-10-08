/*
 * Copyright (c) 2016, 2019 Oracle and/or its affiliates. All rights reserved. This
 * code is released under a tri EPL/GPL/LGPL license. You can use it,
 * redistribute it and/or modify it under the terms of the:
 *
 * Eclipse Public License version 2.0, or
 * GNU General Public License version 2, or
 * GNU Lesser General Public License version 2.1.
 */
package org.truffleruby.options;

// GENERATED BY tool/generate-options.rb
// This file is automatically generated from options.yml with 'jt build options'

import org.graalvm.options.OptionDescriptor;
import org.graalvm.options.OptionValues;
import org.truffleruby.shared.options.OptionsCatalog;
import org.truffleruby.shared.options.Verbosity;
import org.truffleruby.shared.options.Profile;

import com.oracle.truffle.api.TruffleLanguage.Env;

// @formatter:off
public class Options {

    /** --load-paths=StringArrayOptionType.EMPTY_STRING_ARRAY */
    public final String[] LOAD_PATHS;
    /** --required-libraries=StringArrayOptionType.EMPTY_STRING_ARRAY */
    public final String[] REQUIRED_LIBRARIES;
    /** --working-directory="" */
    public final String WORKING_DIRECTORY;
    /** --debug=false */
    public final boolean DEBUG;
    /** --verbose=Verbosity.FALSE */
    public final Verbosity VERBOSITY;
    /** --source-encoding="" */
    public final String SOURCE_ENCODING;
    /** --internal-encoding="" */
    public final String INTERNAL_ENCODING;
    /** --external-encoding="" */
    public final String EXTERNAL_ENCODING;
    /** --no-home-provided=false */
    public final boolean NO_HOME_PROVIDED;
    /** --launcher="" */
    public final String LAUNCHER;
    /** --core-load-path="resource:/truffleruby" */
    public final String CORE_LOAD_PATH;
    /** --frozen-string-literals=false */
    public final boolean FROZEN_STRING_LITERALS;
    /** --rubygems=true */
    public final boolean RUBYGEMS;
    /** --lazy-rubygems=RUBYGEMS && DEFAULT_LAZY */
    public final boolean LAZY_RUBYGEMS;
    /** --patching=true */
    public final boolean PATCHING;
    /** --did-you-mean=true */
    public final boolean DID_YOU_MEAN;
    /** --hashing-deterministic=false */
    public final boolean HASHING_DETERMINISTIC;
    /** --embedded=true */
    public final boolean EMBEDDED;
    /** --platform-native=env.isNativeAccessAllowed() && true */
    public final boolean NATIVE_PLATFORM;
    /** --platform-native-interrupt=NATIVE_PLATFORM */
    public final boolean NATIVE_INTERRUPT;
    /** --platform-handle-interrupt=!EMBEDDED */
    public final boolean HANDLE_INTERRUPT;
    /** --single-threaded=!env.isCreateThreadAllowed() || EMBEDDED */
    public final boolean SINGLE_THREADED;
    /** --polyglot-stdio=EMBEDDED || !NATIVE_PLATFORM */
    public final boolean POLYGLOT_STDIO;
    /** --interop-host=env.isHostLookupAllowed() && true */
    public final boolean HOST_INTEROP;
    /** --trace-calls=true */
    public final boolean TRACE_CALLS;
    /** --coverage-global=false */
    public final boolean COVERAGE_GLOBAL;
    /** --core-as-internal=true */
    public final boolean CORE_AS_INTERNAL;
    /** --stdlib-as-internal=true */
    public final boolean STDLIB_AS_INTERNAL;
    /** --exceptions-store-java=false */
    public final boolean EXCEPTIONS_STORE_JAVA;
    /** --exceptions-print-java=false */
    public final boolean EXCEPTIONS_PRINT_JAVA;
    /** --exceptions-print-uncaught-java=false */
    public final boolean EXCEPTIONS_PRINT_UNCAUGHT_JAVA;
    /** --exceptions-print-ruby-for-java=false */
    public final boolean EXCEPTIONS_PRINT_RUBY_FOR_JAVA;
    /** --exceptions-warn-stackoverflow=true */
    public final boolean EXCEPTIONS_WARN_STACKOVERFLOW;
    /** --exceptions-warn-out-of-memory=true */
    public final boolean EXCEPTIONS_WARN_OUT_OF_MEMORY;
    /** --backtraces-interleave-java=false */
    public final boolean BACKTRACES_INTERLEAVE_JAVA;
    /** --backtraces-limit=9999 */
    public final int BACKTRACES_LIMIT;
    /** --backtraces-on-interrupt=false */
    public final boolean BACKTRACE_ON_INTERRUPT;
    /** --backtraces-sigalrm=!EMBEDDED */
    public final boolean BACKTRACE_ON_SIGALRM;
    /** --backtraces-raise=false */
    public final boolean BACKTRACE_ON_RAISE;
    /** --backtraces-rescue=false */
    public final boolean BACKTRACE_ON_RESCUE;
    /** --cexts=true */
    public final boolean CEXTS;
    /** --cexts-lock=true */
    public final boolean CEXT_LOCK;
    /** --keep-handles-alive=false */
    public final boolean CEXTS_KEEP_HANDLES_ALIVE;
    /** --options-log=false */
    public final boolean OPTIONS_LOG;
    /** --log-load=false */
    public final boolean LOG_LOAD;
    /** --log-autoload=false */
    public final boolean LOG_AUTOLOAD;
    /** --log-feature-location=false */
    public final boolean LOG_FEATURE_LOCATION;
    /** --metrics-profile-require=Profile.NONE */
    public final Profile METRICS_PROFILE_REQUIRE;
    /** --cexts-log-load=false */
    public final boolean CEXTS_LOG_LOAD;
    /** --cexts-log-warnings=false */
    public final boolean CEXTS_LOG_WARNINGS;
    /** --argv-globals=false */
    public final boolean ARGV_GLOBALS;
    /** --chomp-loop=false */
    public final boolean CHOMP_LOOP;
    /** --gets-loop=false */
    public final boolean GETS_LOOP;
    /** --print-loop=false */
    public final boolean PRINT_LOOP;
    /** --split-loop=false */
    public final boolean SPLIT_LOOP;
    /** --ignore-lines-before-ruby-shebang=false */
    public final boolean IGNORE_LINES_BEFORE_RUBY_SHEBANG;
    /** --syntax-check=false */
    public final boolean SYNTAX_CHECK;
    /** --argv-global-values=StringArrayOptionType.EMPTY_STRING_ARRAY */
    public final String[] ARGV_GLOBAL_VALUES;
    /** --argv-global-flags=StringArrayOptionType.EMPTY_STRING_ARRAY */
    public final String[] ARGV_GLOBAL_FLAGS;
    /** --building-core-cexts=false */
    public final boolean BUILDING_CORE_CEXTS;
    /** --rope-print-intern-stats=false */
    public final boolean ROPE_PRINT_INTERN_STATS;
    /** --preinit=true */
    public final boolean PREINITIALIZATION;
    /** --lazy-builtins=DEFAULT_LAZY */
    public final boolean LAZY_BUILTINS;
    /** --default-cache=8 */
    public final int DEFAULT_CACHE;
    /** --method-lookup-cache=DEFAULT_CACHE */
    public final int METHOD_LOOKUP_CACHE;
    /** --dispatch-cache=DEFAULT_CACHE */
    public final int DISPATCH_CACHE;
    /** --yield-cache=DEFAULT_CACHE */
    public final int YIELD_CACHE;
    /** --to-proc-cache=DEFAULT_CACHE */
    public final int METHOD_TO_PROC_CACHE;
    /** --is-a-cache=DEFAULT_CACHE */
    public final int IS_A_CACHE;
    /** --bind-cache=DEFAULT_CACHE */
    public final int BIND_CACHE;
    /** --constant-cache=DEFAULT_CACHE */
    public final int CONSTANT_CACHE;
    /** --instance-variable-cache=DEFAULT_CACHE */
    public final int INSTANCE_VARIABLE_CACHE;
    /** --binding-local-variable-cache=DEFAULT_CACHE */
    public final int BINDING_LOCAL_VARIABLE_CACHE;
    /** --symbol-to-proc-cache=DEFAULT_CACHE */
    public final int SYMBOL_TO_PROC_CACHE;
    /** --allocate-class-cache=DEFAULT_CACHE */
    public final int ALLOCATE_CLASS_CACHE;
    /** --pack-cache=DEFAULT_CACHE */
    public final int PACK_CACHE;
    /** --unpack-cache=DEFAULT_CACHE */
    public final int UNPACK_CACHE;
    /** --eval-cache=DEFAULT_CACHE */
    public final int EVAL_CACHE;
    /** --encoding-compatible-query-cache=DEFAULT_CACHE */
    public final int ENCODING_COMPATIBLE_QUERY_CACHE;
    /** --encoding-loaded-classes-cache=DEFAULT_CACHE */
    public final int ENCODING_LOADED_CLASSES_CACHE;
    /** --interop-convert-cache=DEFAULT_CACHE */
    public final int INTEROP_CONVERT_CACHE;
    /** --interop-execute-cache=DEFAULT_CACHE */
    public final int INTEROP_EXECUTE_CACHE;
    /** --interop-invoke-cache=DEFAULT_CACHE */
    public final int INTEROP_INVOKE_CACHE;
    /** --interop-new-cache=DEFAULT_CACHE */
    public final int INTEROP_NEW_CACHE;
    /** --time-format-cache=DEFAULT_CACHE */
    public final int TIME_FORMAT_CACHE;
    /** --integer-pow-cache=DEFAULT_CACHE */
    public final int POW_CACHE;
    /** --ruby-library-cache=DEFAULT_CACHE */
    public final int RUBY_LIBRARY_CACHE;
    /** --thread-cache=1 */
    public final int THREAD_CACHE;
    /** --identity-cache=1 */
    public final int IDENTITY_CACHE;
    /** --class-cache=3 */
    public final int CLASS_CACHE;
    /** --array-dup-cache=3 */
    public final int ARRAY_DUP_CACHE;
    /** --frame-variable-access-cache=5 */
    public final int FRAME_VARIABLE_ACCESS_CACHE;
    /** --array-strategy-cache=4 */
    public final int ARRAY_STRATEGY_CACHE;
    /** --array-uninitialized-size=16 */
    public final int ARRAY_UNINITIALIZED_SIZE;
    /** --array-small=3 */
    public final int ARRAY_SMALL;
    /** --pack-unroll=4 */
    public final int PACK_UNROLL_LIMIT;
    /** --pack-recover=32 */
    public final int PACK_RECOVER_LOOP_MIN;
    /** --cexts-marking-cache=100 */
    public final int CEXTS_MARKING_CACHE;
    /** --cexts-tonative-stats=false */
    public final boolean CEXTS_TONATIVE_STATS;
    /** --rope-depth-threshold=128 */
    public final int ROPE_DEPTH_THRESHOLD;
    /** --global-variable-max-invalidations=1 */
    public final int GLOBAL_VARIABLE_MAX_INVALIDATIONS;
    /** --clone-default=true */
    public final boolean CLONE_DEFAULT;
    /** --inline-default=true */
    public final boolean INLINE_DEFAULT;
    /** --core-always-clone=false */
    public final boolean CORE_ALWAYS_CLONE;
    /** --always-split-honor=CLONE_DEFAULT */
    public final boolean ALWAYS_SPLIT_HONOR;
    /** --never-split-honor=true */
    public final boolean NEVER_SPLIT_HONOR;
    /** --inline-needs-caller-frame=INLINE_DEFAULT */
    public final boolean INLINE_NEEDS_CALLER_FRAME;
    /** --yield-always-clone=CLONE_DEFAULT */
    public final boolean YIELD_ALWAYS_CLONE;
    /** --yield-always-inline=INLINE_DEFAULT */
    public final boolean YIELD_ALWAYS_INLINE;
    /** --method-missing-always-clone=CLONE_DEFAULT */
    public final boolean METHODMISSING_ALWAYS_CLONE;
    /** --method-missing-always-inline=INLINE_DEFAULT */
    public final boolean METHODMISSING_ALWAYS_INLINE;
    /** --regexp-instrument-creation=false */
    public final boolean REGEXP_INSTRUMENT_CREATION;
    /** --regexp-instrument-match=false */
    public final boolean REGEXP_INSTRUMENT_MATCH;
    /** --metrics-time-parsing-file=false */
    public final boolean METRICS_TIME_PARSING_FILE;
    /** --metrics-time-require=false */
    public final boolean METRICS_TIME_REQUIRE;
    /** --shared-objects=true */
    public final boolean SHARED_OBJECTS_ENABLED;
    /** --shared-objects-debug=false */
    public final boolean SHARED_OBJECTS_DEBUG;
    /** --shared-objects-force=false */
    public final boolean SHARED_OBJECTS_FORCE;
    /** --testing-rubygems=false */
    public final boolean TESTING_RUBYGEMS;

    public Options(Env env, OptionValues options, LanguageOptions languageOptions) {
        LOAD_PATHS = options.get(OptionsCatalog.LOAD_PATHS_KEY);
        REQUIRED_LIBRARIES = options.get(OptionsCatalog.REQUIRED_LIBRARIES_KEY);
        WORKING_DIRECTORY = options.get(OptionsCatalog.WORKING_DIRECTORY_KEY);
        DEBUG = options.get(OptionsCatalog.DEBUG_KEY);
        VERBOSITY = options.get(OptionsCatalog.VERBOSITY_KEY);
        SOURCE_ENCODING = options.get(OptionsCatalog.SOURCE_ENCODING_KEY);
        INTERNAL_ENCODING = options.get(OptionsCatalog.INTERNAL_ENCODING_KEY);
        EXTERNAL_ENCODING = options.get(OptionsCatalog.EXTERNAL_ENCODING_KEY);
        NO_HOME_PROVIDED = options.get(OptionsCatalog.NO_HOME_PROVIDED_KEY);
        LAUNCHER = options.get(OptionsCatalog.LAUNCHER_KEY);
        CORE_LOAD_PATH = options.get(OptionsCatalog.CORE_LOAD_PATH_KEY);
        FROZEN_STRING_LITERALS = options.get(OptionsCatalog.FROZEN_STRING_LITERALS_KEY);
        RUBYGEMS = options.get(OptionsCatalog.RUBYGEMS_KEY);
        LAZY_RUBYGEMS = RUBYGEMS && (options.hasBeenSet(OptionsCatalog.LAZY_RUBYGEMS_KEY) ? options.get(OptionsCatalog.LAZY_RUBYGEMS_KEY) : languageOptions.DEFAULT_LAZY);
        PATCHING = options.get(OptionsCatalog.PATCHING_KEY);
        DID_YOU_MEAN = options.get(OptionsCatalog.DID_YOU_MEAN_KEY);
        HASHING_DETERMINISTIC = options.get(OptionsCatalog.HASHING_DETERMINISTIC_KEY);
        EMBEDDED = options.get(OptionsCatalog.EMBEDDED_KEY);
        NATIVE_PLATFORM = env.isNativeAccessAllowed() && (options.get(OptionsCatalog.NATIVE_PLATFORM_KEY));
        NATIVE_INTERRUPT = options.hasBeenSet(OptionsCatalog.NATIVE_INTERRUPT_KEY) ? options.get(OptionsCatalog.NATIVE_INTERRUPT_KEY) : NATIVE_PLATFORM;
        HANDLE_INTERRUPT = options.hasBeenSet(OptionsCatalog.HANDLE_INTERRUPT_KEY) ? options.get(OptionsCatalog.HANDLE_INTERRUPT_KEY) : !EMBEDDED;
        SINGLE_THREADED = !env.isCreateThreadAllowed() || (options.hasBeenSet(OptionsCatalog.SINGLE_THREADED_KEY) ? options.get(OptionsCatalog.SINGLE_THREADED_KEY) : EMBEDDED);
        POLYGLOT_STDIO = options.hasBeenSet(OptionsCatalog.POLYGLOT_STDIO_KEY) ? options.get(OptionsCatalog.POLYGLOT_STDIO_KEY) : EMBEDDED || !NATIVE_PLATFORM;
        HOST_INTEROP = env.isHostLookupAllowed() && (options.get(OptionsCatalog.HOST_INTEROP_KEY));
        TRACE_CALLS = options.get(OptionsCatalog.TRACE_CALLS_KEY);
        COVERAGE_GLOBAL = options.get(OptionsCatalog.COVERAGE_GLOBAL_KEY);
        CORE_AS_INTERNAL = options.get(OptionsCatalog.CORE_AS_INTERNAL_KEY);
        STDLIB_AS_INTERNAL = options.get(OptionsCatalog.STDLIB_AS_INTERNAL_KEY);
        EXCEPTIONS_STORE_JAVA = options.get(OptionsCatalog.EXCEPTIONS_STORE_JAVA_KEY);
        EXCEPTIONS_PRINT_JAVA = options.get(OptionsCatalog.EXCEPTIONS_PRINT_JAVA_KEY);
        EXCEPTIONS_PRINT_UNCAUGHT_JAVA = options.get(OptionsCatalog.EXCEPTIONS_PRINT_UNCAUGHT_JAVA_KEY);
        EXCEPTIONS_PRINT_RUBY_FOR_JAVA = options.get(OptionsCatalog.EXCEPTIONS_PRINT_RUBY_FOR_JAVA_KEY);
        EXCEPTIONS_WARN_STACKOVERFLOW = options.get(OptionsCatalog.EXCEPTIONS_WARN_STACKOVERFLOW_KEY);
        EXCEPTIONS_WARN_OUT_OF_MEMORY = options.get(OptionsCatalog.EXCEPTIONS_WARN_OUT_OF_MEMORY_KEY);
        BACKTRACES_INTERLEAVE_JAVA = options.get(OptionsCatalog.BACKTRACES_INTERLEAVE_JAVA_KEY);
        BACKTRACES_LIMIT = options.get(OptionsCatalog.BACKTRACES_LIMIT_KEY);
        BACKTRACE_ON_INTERRUPT = options.get(OptionsCatalog.BACKTRACE_ON_INTERRUPT_KEY);
        BACKTRACE_ON_SIGALRM = options.hasBeenSet(OptionsCatalog.BACKTRACE_ON_SIGALRM_KEY) ? options.get(OptionsCatalog.BACKTRACE_ON_SIGALRM_KEY) : !EMBEDDED;
        BACKTRACE_ON_RAISE = options.get(OptionsCatalog.BACKTRACE_ON_RAISE_KEY);
        BACKTRACE_ON_RESCUE = options.get(OptionsCatalog.BACKTRACE_ON_RESCUE_KEY);
        CEXTS = options.get(OptionsCatalog.CEXTS_KEY);
        CEXT_LOCK = options.get(OptionsCatalog.CEXT_LOCK_KEY);
        CEXTS_KEEP_HANDLES_ALIVE = options.get(OptionsCatalog.CEXTS_KEEP_HANDLES_ALIVE_KEY);
        OPTIONS_LOG = options.get(OptionsCatalog.OPTIONS_LOG_KEY);
        LOG_LOAD = options.get(OptionsCatalog.LOG_LOAD_KEY);
        LOG_AUTOLOAD = options.get(OptionsCatalog.LOG_AUTOLOAD_KEY);
        LOG_FEATURE_LOCATION = options.get(OptionsCatalog.LOG_FEATURE_LOCATION_KEY);
        METRICS_PROFILE_REQUIRE = options.get(OptionsCatalog.METRICS_PROFILE_REQUIRE_KEY);
        CEXTS_LOG_LOAD = options.get(OptionsCatalog.CEXTS_LOG_LOAD_KEY);
        CEXTS_LOG_WARNINGS = options.get(OptionsCatalog.CEXTS_LOG_WARNINGS_KEY);
        ARGV_GLOBALS = options.get(OptionsCatalog.ARGV_GLOBALS_KEY);
        CHOMP_LOOP = options.get(OptionsCatalog.CHOMP_LOOP_KEY);
        GETS_LOOP = options.get(OptionsCatalog.GETS_LOOP_KEY);
        PRINT_LOOP = options.get(OptionsCatalog.PRINT_LOOP_KEY);
        SPLIT_LOOP = options.get(OptionsCatalog.SPLIT_LOOP_KEY);
        IGNORE_LINES_BEFORE_RUBY_SHEBANG = options.get(OptionsCatalog.IGNORE_LINES_BEFORE_RUBY_SHEBANG_KEY);
        SYNTAX_CHECK = options.get(OptionsCatalog.SYNTAX_CHECK_KEY);
        ARGV_GLOBAL_VALUES = options.get(OptionsCatalog.ARGV_GLOBAL_VALUES_KEY);
        ARGV_GLOBAL_FLAGS = options.get(OptionsCatalog.ARGV_GLOBAL_FLAGS_KEY);
        BUILDING_CORE_CEXTS = options.get(OptionsCatalog.BUILDING_CORE_CEXTS_KEY);
        ROPE_PRINT_INTERN_STATS = options.get(OptionsCatalog.ROPE_PRINT_INTERN_STATS_KEY);
        PREINITIALIZATION = options.get(OptionsCatalog.PREINITIALIZATION_KEY);
        LAZY_BUILTINS = options.hasBeenSet(OptionsCatalog.LAZY_BUILTINS_KEY) ? options.get(OptionsCatalog.LAZY_BUILTINS_KEY) : languageOptions.DEFAULT_LAZY;
        DEFAULT_CACHE = options.get(OptionsCatalog.DEFAULT_CACHE_KEY);
        METHOD_LOOKUP_CACHE = options.hasBeenSet(OptionsCatalog.METHOD_LOOKUP_CACHE_KEY) ? options.get(OptionsCatalog.METHOD_LOOKUP_CACHE_KEY) : DEFAULT_CACHE;
        DISPATCH_CACHE = options.hasBeenSet(OptionsCatalog.DISPATCH_CACHE_KEY) ? options.get(OptionsCatalog.DISPATCH_CACHE_KEY) : DEFAULT_CACHE;
        YIELD_CACHE = options.hasBeenSet(OptionsCatalog.YIELD_CACHE_KEY) ? options.get(OptionsCatalog.YIELD_CACHE_KEY) : DEFAULT_CACHE;
        METHOD_TO_PROC_CACHE = options.hasBeenSet(OptionsCatalog.METHOD_TO_PROC_CACHE_KEY) ? options.get(OptionsCatalog.METHOD_TO_PROC_CACHE_KEY) : DEFAULT_CACHE;
        IS_A_CACHE = options.hasBeenSet(OptionsCatalog.IS_A_CACHE_KEY) ? options.get(OptionsCatalog.IS_A_CACHE_KEY) : DEFAULT_CACHE;
        BIND_CACHE = options.hasBeenSet(OptionsCatalog.BIND_CACHE_KEY) ? options.get(OptionsCatalog.BIND_CACHE_KEY) : DEFAULT_CACHE;
        CONSTANT_CACHE = options.hasBeenSet(OptionsCatalog.CONSTANT_CACHE_KEY) ? options.get(OptionsCatalog.CONSTANT_CACHE_KEY) : DEFAULT_CACHE;
        INSTANCE_VARIABLE_CACHE = options.hasBeenSet(OptionsCatalog.INSTANCE_VARIABLE_CACHE_KEY) ? options.get(OptionsCatalog.INSTANCE_VARIABLE_CACHE_KEY) : DEFAULT_CACHE;
        BINDING_LOCAL_VARIABLE_CACHE = options.hasBeenSet(OptionsCatalog.BINDING_LOCAL_VARIABLE_CACHE_KEY) ? options.get(OptionsCatalog.BINDING_LOCAL_VARIABLE_CACHE_KEY) : DEFAULT_CACHE;
        SYMBOL_TO_PROC_CACHE = options.hasBeenSet(OptionsCatalog.SYMBOL_TO_PROC_CACHE_KEY) ? options.get(OptionsCatalog.SYMBOL_TO_PROC_CACHE_KEY) : DEFAULT_CACHE;
        ALLOCATE_CLASS_CACHE = options.hasBeenSet(OptionsCatalog.ALLOCATE_CLASS_CACHE_KEY) ? options.get(OptionsCatalog.ALLOCATE_CLASS_CACHE_KEY) : DEFAULT_CACHE;
        PACK_CACHE = options.hasBeenSet(OptionsCatalog.PACK_CACHE_KEY) ? options.get(OptionsCatalog.PACK_CACHE_KEY) : DEFAULT_CACHE;
        UNPACK_CACHE = options.hasBeenSet(OptionsCatalog.UNPACK_CACHE_KEY) ? options.get(OptionsCatalog.UNPACK_CACHE_KEY) : DEFAULT_CACHE;
        EVAL_CACHE = options.hasBeenSet(OptionsCatalog.EVAL_CACHE_KEY) ? options.get(OptionsCatalog.EVAL_CACHE_KEY) : DEFAULT_CACHE;
        ENCODING_COMPATIBLE_QUERY_CACHE = options.hasBeenSet(OptionsCatalog.ENCODING_COMPATIBLE_QUERY_CACHE_KEY) ? options.get(OptionsCatalog.ENCODING_COMPATIBLE_QUERY_CACHE_KEY) : DEFAULT_CACHE;
        ENCODING_LOADED_CLASSES_CACHE = options.hasBeenSet(OptionsCatalog.ENCODING_LOADED_CLASSES_CACHE_KEY) ? options.get(OptionsCatalog.ENCODING_LOADED_CLASSES_CACHE_KEY) : DEFAULT_CACHE;
        INTEROP_CONVERT_CACHE = options.hasBeenSet(OptionsCatalog.INTEROP_CONVERT_CACHE_KEY) ? options.get(OptionsCatalog.INTEROP_CONVERT_CACHE_KEY) : DEFAULT_CACHE;
        INTEROP_EXECUTE_CACHE = options.hasBeenSet(OptionsCatalog.INTEROP_EXECUTE_CACHE_KEY) ? options.get(OptionsCatalog.INTEROP_EXECUTE_CACHE_KEY) : DEFAULT_CACHE;
        INTEROP_INVOKE_CACHE = options.hasBeenSet(OptionsCatalog.INTEROP_INVOKE_CACHE_KEY) ? options.get(OptionsCatalog.INTEROP_INVOKE_CACHE_KEY) : DEFAULT_CACHE;
        INTEROP_NEW_CACHE = options.hasBeenSet(OptionsCatalog.INTEROP_NEW_CACHE_KEY) ? options.get(OptionsCatalog.INTEROP_NEW_CACHE_KEY) : DEFAULT_CACHE;
        TIME_FORMAT_CACHE = options.hasBeenSet(OptionsCatalog.TIME_FORMAT_CACHE_KEY) ? options.get(OptionsCatalog.TIME_FORMAT_CACHE_KEY) : DEFAULT_CACHE;
        POW_CACHE = options.hasBeenSet(OptionsCatalog.POW_CACHE_KEY) ? options.get(OptionsCatalog.POW_CACHE_KEY) : DEFAULT_CACHE;
        RUBY_LIBRARY_CACHE = options.hasBeenSet(OptionsCatalog.RUBY_LIBRARY_CACHE_KEY) ? options.get(OptionsCatalog.RUBY_LIBRARY_CACHE_KEY) : DEFAULT_CACHE;
        THREAD_CACHE = options.get(OptionsCatalog.THREAD_CACHE_KEY);
        IDENTITY_CACHE = options.get(OptionsCatalog.IDENTITY_CACHE_KEY);
        CLASS_CACHE = options.get(OptionsCatalog.CLASS_CACHE_KEY);
        ARRAY_DUP_CACHE = options.get(OptionsCatalog.ARRAY_DUP_CACHE_KEY);
        FRAME_VARIABLE_ACCESS_CACHE = options.get(OptionsCatalog.FRAME_VARIABLE_ACCESS_CACHE_KEY);
        ARRAY_STRATEGY_CACHE = options.get(OptionsCatalog.ARRAY_STRATEGY_CACHE_KEY);
        ARRAY_UNINITIALIZED_SIZE = options.get(OptionsCatalog.ARRAY_UNINITIALIZED_SIZE_KEY);
        ARRAY_SMALL = options.get(OptionsCatalog.ARRAY_SMALL_KEY);
        PACK_UNROLL_LIMIT = options.get(OptionsCatalog.PACK_UNROLL_LIMIT_KEY);
        PACK_RECOVER_LOOP_MIN = options.get(OptionsCatalog.PACK_RECOVER_LOOP_MIN_KEY);
        CEXTS_MARKING_CACHE = options.get(OptionsCatalog.CEXTS_MARKING_CACHE_KEY);
        CEXTS_TONATIVE_STATS = options.get(OptionsCatalog.CEXTS_TONATIVE_STATS_KEY);
        ROPE_DEPTH_THRESHOLD = options.get(OptionsCatalog.ROPE_DEPTH_THRESHOLD_KEY);
        GLOBAL_VARIABLE_MAX_INVALIDATIONS = options.get(OptionsCatalog.GLOBAL_VARIABLE_MAX_INVALIDATIONS_KEY);
        CLONE_DEFAULT = options.get(OptionsCatalog.CLONE_DEFAULT_KEY);
        INLINE_DEFAULT = options.get(OptionsCatalog.INLINE_DEFAULT_KEY);
        CORE_ALWAYS_CLONE = options.get(OptionsCatalog.CORE_ALWAYS_CLONE_KEY);
        ALWAYS_SPLIT_HONOR = options.hasBeenSet(OptionsCatalog.ALWAYS_SPLIT_HONOR_KEY) ? options.get(OptionsCatalog.ALWAYS_SPLIT_HONOR_KEY) : CLONE_DEFAULT;
        NEVER_SPLIT_HONOR = options.get(OptionsCatalog.NEVER_SPLIT_HONOR_KEY);
        INLINE_NEEDS_CALLER_FRAME = options.hasBeenSet(OptionsCatalog.INLINE_NEEDS_CALLER_FRAME_KEY) ? options.get(OptionsCatalog.INLINE_NEEDS_CALLER_FRAME_KEY) : INLINE_DEFAULT;
        YIELD_ALWAYS_CLONE = options.hasBeenSet(OptionsCatalog.YIELD_ALWAYS_CLONE_KEY) ? options.get(OptionsCatalog.YIELD_ALWAYS_CLONE_KEY) : CLONE_DEFAULT;
        YIELD_ALWAYS_INLINE = options.hasBeenSet(OptionsCatalog.YIELD_ALWAYS_INLINE_KEY) ? options.get(OptionsCatalog.YIELD_ALWAYS_INLINE_KEY) : INLINE_DEFAULT;
        METHODMISSING_ALWAYS_CLONE = options.hasBeenSet(OptionsCatalog.METHODMISSING_ALWAYS_CLONE_KEY) ? options.get(OptionsCatalog.METHODMISSING_ALWAYS_CLONE_KEY) : CLONE_DEFAULT;
        METHODMISSING_ALWAYS_INLINE = options.hasBeenSet(OptionsCatalog.METHODMISSING_ALWAYS_INLINE_KEY) ? options.get(OptionsCatalog.METHODMISSING_ALWAYS_INLINE_KEY) : INLINE_DEFAULT;
        REGEXP_INSTRUMENT_CREATION = options.get(OptionsCatalog.REGEXP_INSTRUMENT_CREATION_KEY);
        REGEXP_INSTRUMENT_MATCH = options.get(OptionsCatalog.REGEXP_INSTRUMENT_MATCH_KEY);
        METRICS_TIME_PARSING_FILE = options.get(OptionsCatalog.METRICS_TIME_PARSING_FILE_KEY);
        METRICS_TIME_REQUIRE = options.get(OptionsCatalog.METRICS_TIME_REQUIRE_KEY);
        SHARED_OBJECTS_ENABLED = options.get(OptionsCatalog.SHARED_OBJECTS_ENABLED_KEY);
        SHARED_OBJECTS_DEBUG = options.get(OptionsCatalog.SHARED_OBJECTS_DEBUG_KEY);
        SHARED_OBJECTS_FORCE = options.get(OptionsCatalog.SHARED_OBJECTS_FORCE_KEY);
        TESTING_RUBYGEMS = options.get(OptionsCatalog.TESTING_RUBYGEMS_KEY);
    }

    public Object fromDescriptor(OptionDescriptor descriptor) {
        switch (descriptor.getName()) {
            case "ruby.load-paths":
                return LOAD_PATHS;
            case "ruby.required-libraries":
                return REQUIRED_LIBRARIES;
            case "ruby.working-directory":
                return WORKING_DIRECTORY;
            case "ruby.debug":
                return DEBUG;
            case "ruby.verbose":
                return VERBOSITY;
            case "ruby.source-encoding":
                return SOURCE_ENCODING;
            case "ruby.internal-encoding":
                return INTERNAL_ENCODING;
            case "ruby.external-encoding":
                return EXTERNAL_ENCODING;
            case "ruby.no-home-provided":
                return NO_HOME_PROVIDED;
            case "ruby.launcher":
                return LAUNCHER;
            case "ruby.core-load-path":
                return CORE_LOAD_PATH;
            case "ruby.frozen-string-literals":
                return FROZEN_STRING_LITERALS;
            case "ruby.rubygems":
                return RUBYGEMS;
            case "ruby.lazy-rubygems":
                return LAZY_RUBYGEMS;
            case "ruby.patching":
                return PATCHING;
            case "ruby.did-you-mean":
                return DID_YOU_MEAN;
            case "ruby.hashing-deterministic":
                return HASHING_DETERMINISTIC;
            case "ruby.embedded":
                return EMBEDDED;
            case "ruby.platform-native":
                return NATIVE_PLATFORM;
            case "ruby.platform-native-interrupt":
                return NATIVE_INTERRUPT;
            case "ruby.platform-handle-interrupt":
                return HANDLE_INTERRUPT;
            case "ruby.single-threaded":
                return SINGLE_THREADED;
            case "ruby.polyglot-stdio":
                return POLYGLOT_STDIO;
            case "ruby.interop-host":
                return HOST_INTEROP;
            case "ruby.trace-calls":
                return TRACE_CALLS;
            case "ruby.coverage-global":
                return COVERAGE_GLOBAL;
            case "ruby.core-as-internal":
                return CORE_AS_INTERNAL;
            case "ruby.stdlib-as-internal":
                return STDLIB_AS_INTERNAL;
            case "ruby.exceptions-store-java":
                return EXCEPTIONS_STORE_JAVA;
            case "ruby.exceptions-print-java":
                return EXCEPTIONS_PRINT_JAVA;
            case "ruby.exceptions-print-uncaught-java":
                return EXCEPTIONS_PRINT_UNCAUGHT_JAVA;
            case "ruby.exceptions-print-ruby-for-java":
                return EXCEPTIONS_PRINT_RUBY_FOR_JAVA;
            case "ruby.exceptions-warn-stackoverflow":
                return EXCEPTIONS_WARN_STACKOVERFLOW;
            case "ruby.exceptions-warn-out-of-memory":
                return EXCEPTIONS_WARN_OUT_OF_MEMORY;
            case "ruby.backtraces-interleave-java":
                return BACKTRACES_INTERLEAVE_JAVA;
            case "ruby.backtraces-limit":
                return BACKTRACES_LIMIT;
            case "ruby.backtraces-on-interrupt":
                return BACKTRACE_ON_INTERRUPT;
            case "ruby.backtraces-sigalrm":
                return BACKTRACE_ON_SIGALRM;
            case "ruby.backtraces-raise":
                return BACKTRACE_ON_RAISE;
            case "ruby.backtraces-rescue":
                return BACKTRACE_ON_RESCUE;
            case "ruby.cexts":
                return CEXTS;
            case "ruby.cexts-lock":
                return CEXT_LOCK;
            case "ruby.keep-handles-alive":
                return CEXTS_KEEP_HANDLES_ALIVE;
            case "ruby.options-log":
                return OPTIONS_LOG;
            case "ruby.log-load":
                return LOG_LOAD;
            case "ruby.log-autoload":
                return LOG_AUTOLOAD;
            case "ruby.log-feature-location":
                return LOG_FEATURE_LOCATION;
            case "ruby.metrics-profile-require":
                return METRICS_PROFILE_REQUIRE;
            case "ruby.cexts-log-load":
                return CEXTS_LOG_LOAD;
            case "ruby.cexts-log-warnings":
                return CEXTS_LOG_WARNINGS;
            case "ruby.argv-globals":
                return ARGV_GLOBALS;
            case "ruby.chomp-loop":
                return CHOMP_LOOP;
            case "ruby.gets-loop":
                return GETS_LOOP;
            case "ruby.print-loop":
                return PRINT_LOOP;
            case "ruby.split-loop":
                return SPLIT_LOOP;
            case "ruby.ignore-lines-before-ruby-shebang":
                return IGNORE_LINES_BEFORE_RUBY_SHEBANG;
            case "ruby.syntax-check":
                return SYNTAX_CHECK;
            case "ruby.argv-global-values":
                return ARGV_GLOBAL_VALUES;
            case "ruby.argv-global-flags":
                return ARGV_GLOBAL_FLAGS;
            case "ruby.building-core-cexts":
                return BUILDING_CORE_CEXTS;
            case "ruby.rope-print-intern-stats":
                return ROPE_PRINT_INTERN_STATS;
            case "ruby.preinit":
                return PREINITIALIZATION;
            case "ruby.lazy-builtins":
                return LAZY_BUILTINS;
            case "ruby.default-cache":
                return DEFAULT_CACHE;
            case "ruby.method-lookup-cache":
                return METHOD_LOOKUP_CACHE;
            case "ruby.dispatch-cache":
                return DISPATCH_CACHE;
            case "ruby.yield-cache":
                return YIELD_CACHE;
            case "ruby.to-proc-cache":
                return METHOD_TO_PROC_CACHE;
            case "ruby.is-a-cache":
                return IS_A_CACHE;
            case "ruby.bind-cache":
                return BIND_CACHE;
            case "ruby.constant-cache":
                return CONSTANT_CACHE;
            case "ruby.instance-variable-cache":
                return INSTANCE_VARIABLE_CACHE;
            case "ruby.binding-local-variable-cache":
                return BINDING_LOCAL_VARIABLE_CACHE;
            case "ruby.symbol-to-proc-cache":
                return SYMBOL_TO_PROC_CACHE;
            case "ruby.allocate-class-cache":
                return ALLOCATE_CLASS_CACHE;
            case "ruby.pack-cache":
                return PACK_CACHE;
            case "ruby.unpack-cache":
                return UNPACK_CACHE;
            case "ruby.eval-cache":
                return EVAL_CACHE;
            case "ruby.encoding-compatible-query-cache":
                return ENCODING_COMPATIBLE_QUERY_CACHE;
            case "ruby.encoding-loaded-classes-cache":
                return ENCODING_LOADED_CLASSES_CACHE;
            case "ruby.interop-convert-cache":
                return INTEROP_CONVERT_CACHE;
            case "ruby.interop-execute-cache":
                return INTEROP_EXECUTE_CACHE;
            case "ruby.interop-invoke-cache":
                return INTEROP_INVOKE_CACHE;
            case "ruby.interop-new-cache":
                return INTEROP_NEW_CACHE;
            case "ruby.time-format-cache":
                return TIME_FORMAT_CACHE;
            case "ruby.integer-pow-cache":
                return POW_CACHE;
            case "ruby.ruby-library-cache":
                return RUBY_LIBRARY_CACHE;
            case "ruby.thread-cache":
                return THREAD_CACHE;
            case "ruby.identity-cache":
                return IDENTITY_CACHE;
            case "ruby.class-cache":
                return CLASS_CACHE;
            case "ruby.array-dup-cache":
                return ARRAY_DUP_CACHE;
            case "ruby.frame-variable-access-cache":
                return FRAME_VARIABLE_ACCESS_CACHE;
            case "ruby.array-strategy-cache":
                return ARRAY_STRATEGY_CACHE;
            case "ruby.array-uninitialized-size":
                return ARRAY_UNINITIALIZED_SIZE;
            case "ruby.array-small":
                return ARRAY_SMALL;
            case "ruby.pack-unroll":
                return PACK_UNROLL_LIMIT;
            case "ruby.pack-recover":
                return PACK_RECOVER_LOOP_MIN;
            case "ruby.cexts-marking-cache":
                return CEXTS_MARKING_CACHE;
            case "ruby.cexts-tonative-stats":
                return CEXTS_TONATIVE_STATS;
            case "ruby.rope-depth-threshold":
                return ROPE_DEPTH_THRESHOLD;
            case "ruby.global-variable-max-invalidations":
                return GLOBAL_VARIABLE_MAX_INVALIDATIONS;
            case "ruby.clone-default":
                return CLONE_DEFAULT;
            case "ruby.inline-default":
                return INLINE_DEFAULT;
            case "ruby.core-always-clone":
                return CORE_ALWAYS_CLONE;
            case "ruby.always-split-honor":
                return ALWAYS_SPLIT_HONOR;
            case "ruby.never-split-honor":
                return NEVER_SPLIT_HONOR;
            case "ruby.inline-needs-caller-frame":
                return INLINE_NEEDS_CALLER_FRAME;
            case "ruby.yield-always-clone":
                return YIELD_ALWAYS_CLONE;
            case "ruby.yield-always-inline":
                return YIELD_ALWAYS_INLINE;
            case "ruby.method-missing-always-clone":
                return METHODMISSING_ALWAYS_CLONE;
            case "ruby.method-missing-always-inline":
                return METHODMISSING_ALWAYS_INLINE;
            case "ruby.regexp-instrument-creation":
                return REGEXP_INSTRUMENT_CREATION;
            case "ruby.regexp-instrument-match":
                return REGEXP_INSTRUMENT_MATCH;
            case "ruby.metrics-time-parsing-file":
                return METRICS_TIME_PARSING_FILE;
            case "ruby.metrics-time-require":
                return METRICS_TIME_REQUIRE;
            case "ruby.shared-objects":
                return SHARED_OBJECTS_ENABLED;
            case "ruby.shared-objects-debug":
                return SHARED_OBJECTS_DEBUG;
            case "ruby.shared-objects-force":
                return SHARED_OBJECTS_FORCE;
            case "ruby.testing-rubygems":
                return TESTING_RUBYGEMS;
            default:
                return null;
        }
    }

}
// @formatter:on
