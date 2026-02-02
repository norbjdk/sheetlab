import HeroImage from "../assets/img/hero.jpg";

function HeroSection() {
    return (
        <div className={`mx-auto flex flex-col md:flex-row items-center gap-10 py-20`}>
            {/* Hook Image */}
            <div className={`flex-1 flex justify-center`}>
                <img src={HeroImage} alt="Hook Image" className={`w-full max-w-4xl rounded-2xl shadow-2xl`}/>
            </div>
            {/* Hook Text */}
            <div className="flex-1 text-center md:text-right space-y-6 flex justify-end flex-col">
                <h1 className="text-[#FFFCF2] text-5xl md:text-6xl font-bold tracking-tight">Compose <span className="text-[#EB5E28]">without</span> limits.</h1>
                <p className="text-[#CCC5B9] text-lg md:text-xl max-w-2xl ml-auto">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam a purus ornare, interdum tellus sed, elementum massa. Aliquam tristique enim quis feugiat tincidunt. 
                <span className="font-semibold text-[#FFFCF2]"></span> . </p>   
                <div className="flex justify-end flex-col md:flex-row gap-4 p-4">
                    <button className="px-8 py-3 bg-[#EB5E28] text-[#252422] hover:bg-[#ff6d38] rounded-full font-sans font-bold transition-all transform hover:scale-105 cursor-pointer shadow-lg">
                        Start Composing
                    </button>
                    <button className="px-8 py-3 border-2 border-[#CCC5B9] text-[#FFFCF2] hover:bg-[#CCC5B9] hover:text-[#252422] rounded-full font-sans font-semibold transition-all cursor-pointer">
                        Explore Scores
                    </button>
                </div>
            </div>
        </div>
    );
}

export default HeroSection;