# this is for generating the input test cases
# given some constraints
import numpy as np
import argparse, os

# parser to get the json config file path
parser = argparse.ArgumentParser()
# define seed arg
parser.add_argument("--seed", default=1, dest="seed", type=int,
                    help="The random seed, default=None means every run is different.")
# define arg for number of test cases you would like to generate
parser.add_argument("--n_test_cases", default=10, dest="n_test_cases", type=int,
                    help="The number of test cases you would like to generate.")
# whether you would like to overwrite already existing test cases
parser.add_argument("--skipIfExists", default=True, dest="skipIfExists", type=bool,
                    help="Whether or not you would like to overwire existing test cases.")
# define low for n
parser.add_argument("--low_n", default=1, dest="low_n", type=int,
                    help="The low value of n to be fetched randomly from uniform.")
# define high for n
parser.add_argument("--high_n", default=5*10**4, dest="high_n", type=int,
                    help="The high value of n to be fetched randomly from uniform.")

# define low for l
parser.add_argument("--low_l", default=1, dest="low_l", type=int,
                    help="The low value of l to be fetched randomly from uniform.")
# define high for l
parser.add_argument("--high_l", default=5*10**4, dest="high_l", type=int,
                    help="The high value of l to be fetched randomly from uniform.")
# define low for company_i
parser.add_argument("--low_company_i", default=1, dest="low_company_i", type=int,
                    help="The low value of company_i to be fetched randomly from uniform.")
# define high for company_i
parser.add_argument("--high_company_i", default=3*10**4, dest="high_company_i", type=int,
                    help="The high value of company_i to be fetched randomly from uniform.")

if __name__ == '__main__':
    # constraints
    """
    $1 \le n \le 5 * 10^4$  ------------------ 1 <= n <= 5 * 10^4
    $1 \le companies[i] \le 3 * 10^4$ --------- 1 <= companies[i] <= limit <= 3 * 10^4
    """
    # input sample
    """
    5
    3 5 3 4
    """
    # parse the args
    args = parser.parse_args()
    # set random state
    r = np.random.RandomState(args.seed)
    # root test cases
    root_dir = "test-cases"
    # loop through test cases
    for test_case in range(args.n_test_cases):
        # set out file path
        out_file = "{}/input{:02d}.txt".format(root_dir, test_case)
        # check if we have to skip if exists
        if args.skipIfExists and os.path.exists(out_file):
            # skip
            print(f"Skipping since {out_file} already exists.")
            continue
        # set limits for l
        l = {"low": args.low_l, "high": args.high_l, "size": (1,)}
        # generate n
        n = r.randint(**n)[0]
        # set limits for n
        n = {"low": args.low_n, "high": args.high_n, "size": (1,)}
        # generate n
        n = r.randint(**n)[0]
        # set limits for companies array
        companies = {"low": args.low_company_i, "high": args.high_company_i, "size": (n,)}
        # generate the companies array
        companies = r.randint(**companies).astype(str)
        # write to file
        with open(out_file, "w") as f:
            # write n
            f.write(f"{n}\n")
            # write the companies array
            f.write(" ".join(companies))
        # log finished
        print(f"Written {out_file}")